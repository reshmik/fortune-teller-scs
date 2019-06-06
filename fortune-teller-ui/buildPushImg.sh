#!/usr/bin/env bash

mvn clean package -DskipTests=true;
docker build . -t kathywan/fortune-ui;
docker push kathywan/fortune-ui;