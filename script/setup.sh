#!/bin/bash

SOURCE_DIR=$(pwd)/app/nodejs-v16/src/main

V14_DIR=$(pwd)/app/nodejs-v14/src/main
if [ -e "$V14_DIR" ]; then
  unlink "$V14_DIR"
  echo "V14 dir already exists."
else
  ln -s "$SOURCE_DIR" "$V14_DIR";
  echo "V14 dir created.";
fi

V12_DIR=$(pwd)/app/nodejs-v12/src/main
if [ -e "$V12_DIR" ]; then
  unlink "$V12_DIR"
  echo "V12 dir already exists."
else
  ln -s "$SOURCE_DIR" "$V12_DIR";
  echo "V12 dir created.";
fi
