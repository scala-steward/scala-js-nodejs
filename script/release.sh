#! /bin/bash

cat ./version.sbt

export LANG=C
sbt clean +publishSigned sonatypeBundleUpload sonatypeReleaseAll
