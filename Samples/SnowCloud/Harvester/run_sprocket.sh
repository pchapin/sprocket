#!/bin/bash

# Set this to the appropriate thing
TOSDIR=/opt/tinyos-2.1.2/tos
sprocket -I=$TOSDIR/lib/net:$TOSDIR/lib/net/ctp:$TOSDIR/lib/net/le:$TOSDIR/lib/net/4bitle:$TOSDIR/lib/printf:$TOSDIR/lib/net/drip
