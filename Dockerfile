# install a base image
FROM openjdk:8-jdk-alpine

RUN apk add --no-cache bash

# create root directory in docker image
RUN mkdir /app
WORKDIR /app

# copy gradle files into docker image
ADD build.gradle.kts /app
ADD settings.gradle.kts /app
ADD gradlew /app
ADD gradle /app/gradle

# copy source code into docker iamge
ADD src /app/src

# build project via gradle
RUN /app/gradlew clean build