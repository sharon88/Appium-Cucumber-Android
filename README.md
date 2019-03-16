# Appium-Cucumber-Android
This is s demo app to show the structure of running the Appium+Cucumber

Command to run:
mvn clean test

Command to run specific scenario:
mvn clean test -Dcucumber.options="--tags ~@account2 --tags @login"

The ~ before the @ tag indicates the tag that has to be ignored, ex in the above case the scenarios @account2 will not be run
