#!/bin/sh
while ! nc -z config-service 8888 ; do
    echo "Waiting for the Config Server"
    sleep 3
done
java -jar /opt/lib/registry-service.jar
