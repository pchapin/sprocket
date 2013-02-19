#!/bin/bash

# NOTE: This script should be run in the root of the Sprocket folder.
# This script could probably be combined with pack.sh and made into a single menu driven script.

# Recursive function for removing Sprocket artifacts
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

# Clean up IntelliJ artifacts.
for DIR in build; do
    if [ -d $DIR ]; then
        rm -rf $DIR
    fi
done

# Clean up Sprocket artifacts.
desprocket

# Clean up documentation artifacts. There is more that could be done here.
for FILE in main.aux main.log main.out main.pdf main.toc; do
    if [ -f doc/Reference-Manual/$FILE ]; then
        rm doc/Reference-Manual/$FILE
    fi
done

