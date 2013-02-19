#!/bin/bash

# NOTE: This script should be run in the root of a copy of the main Sprocket folder.
# This script could probably be combined with clean.sh and made into a single menu driven script.

PACK_DIRECTORY=/tmp/Sprocket

# Recursive function for removing Subversion control directories.
function desvn {
    if [ -d .svn ]; then
        rm -rf .svn
    fi
    for FILE in *; do
        if [ -d "$FILE" ]; then
            cd "$FILE"
            desvn
            cd ..
        fi
    done
}

# Recursive function for removing Sprocket and compilation artifacts
function desprocket {
    if [ -d Sprocket-Tmp ]; then
        rm -rf Sprocket-Tmp
    fi
    if [ -d Sprocket-Out ]; then
        rm -rf Sprocket-Out
    fi
    # These 'build' directories are left by the nesC compiler (using MAKERULES)
    if [ -d build ]; then
        rm -rf build
    fi
    for FILE in *; do
        if [ -d "$FILE" ]; then
            cd "$FILE"
            desprocket
            cd ..
        fi
    done
}


if [ -d $PACK_DIRECTORY ]; then
    echo "Pack directory ($PACK_DIRECTORY) exists. Remove manually and try again."
    exit 1
fi
mkdir $PACK_DIRECTORY
tar cf - . | (cd $PACK_DIRECTORY; tar xf -)
cd $PACK_DIRECTORY

# Clean up Subversion control directories.
desvn

# Clean up IntelliJ artifacts.
for DIR in build; do
    if [ -d $DIR ]; then
        rm -rf $DIR
    fi
done

# Clean up Sprocket artifacts.
desprocket

# Clean up personal IntelliJ settings.
if [ -d .idea/dictionaries ]; then
    rm -rf .idea/dictionaries
fi
if [ -f .idea/workspace.xml ]; then
    rm .idea/workspace.xml
fi

for FILE in main.aux main.log main.out main.pdf main.toc; do
    if [ -f doc/Reference-Manual/$FILE ]; then
        rm doc/Reference-Manual/$FILE
    fi
done


cd ..
tar cf - Sprocket | gzip > $HOME/Sprocket-src-$(date +%F).tar.gz
rm -rf Sprocket
