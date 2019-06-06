#!/usr/bin/env bash

mvn clean package -DskipTests=true;
docker build . -t kathywan/fortune-eureka-server;
docker push kathywan/fortune-eureka-server;