#!/bin/sh
while ! nc -z registry-service 8001 ; do
    echo "Waiting for the Discovery"
    sleep 3
done
while ! nc -z config-service 8000 ; do
    echo "Waiting for the Config sevice"
    sleep 3
done
while ! nc -z mongo-oauth 27017 ; do
    echo "Waiting for the MongoDB"
    sleep 3
done
sleep 40
java -jar /opt/lib/auth-service.jar
