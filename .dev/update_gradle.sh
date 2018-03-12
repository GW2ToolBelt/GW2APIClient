#!/bin/bash

sh ./gradlew wrapper --gradle-distribution-url="$1" -q
command git commit  -m "chore: update Gradle distro" -o ./gradle/wrapper/gradle-wrapper.jar ./gradle/wrapper/gradle-wrapper.properties ./gradlew ./gradlew.bat