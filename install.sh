#!/usr/bin/env bash

rm -rf supraft-proto/src/main/java/*

mvn clean install -N
mvn clean install -pl supraft-proto -Pcompile -Dmaven.test.skip
mvn clean install -pl supraft-core -Dmaven.test.skip
