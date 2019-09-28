#!/bin/sh
while ! nc -z registry-service 8001 ; do
    echo "Waiting for the Discovery"
    sleep 3
done
java -jar /opt/lib/config-service.jar
