

.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build:
	./gradlew installDist

lint:
	./gradlew checkstyleMain checkstyleTest

run:
	./gradlew run

run-dist:
	./build/install/hexlet-gradle-project/bin/hexlet-gradle-project

update-deps:
	./gradlew useLatestVersions

build-run: clean build run-dist