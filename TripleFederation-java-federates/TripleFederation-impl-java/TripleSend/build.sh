#!/usr/bin/env bash

DIR=`pwd`
mvn clean install -U
cd target
zip -r triplesend.zip TripleSend-0.1.0-SNAPSHOT.jar ../run*.sh RTI.rid conf
cd $DIR
