#!/usr/bin/env bash

mvn clean package -DskipTests=true;
docker build . -t kathywan/fortune-service;
docker push kathywan/fortune-service;