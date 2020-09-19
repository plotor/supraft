#!/usr/bin/env bash

version=1.0.0-SNAPSHOT

mvn versions:set -DallowSnapshots=true -DnewVersion=${version}
