@echo off

REM Edit this file as appropriate and put it on your PATH.

set SPROCKET_CLASSPATH=C:\Users\Peter\prog\Sprocket\build\production\Sprocket
set SPROCKET_CLASSPATH=C:\Users\Peter\prog\Sprocket\lib\antlr-3.4.jar;%SPROCKET_CLASSPATH%
set SPROCKET_CLASSPATH=C:\Users\Peter\prog\Sprocket\lib\bcprov-jdk16-145.jar;%SPROCKET_CLASSPATH%

scala -cp %SPROCKET_CLASSPATH% edu.vtc.sprocket.Main %1 %2
