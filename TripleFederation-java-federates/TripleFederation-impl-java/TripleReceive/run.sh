#!/usr/bin/env bash

printf "\ec"
RTI_FILE="$DIR/RTI.rid"
LOG4J="log4j.configurationFile=conf/log4j2.xml"
IPV4="java.net.preferIPv4Stack=true"
logtofile="-l "

java \
-D$LOG4J \
-D$IPV4 \
-jar TripleReceive-0.1.0-SNAPSHOT.jar -configFile conf/TripleReceiveConfig.json
