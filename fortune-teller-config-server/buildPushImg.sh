#!/usr/bin/env bash

mvn clean package -DskipTests=true;
docker build . -t kathywan/fortune-config-server;
docker push kathywan/fortune-config-server;