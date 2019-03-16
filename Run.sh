#!/usr/bin/env bash

/usr/local/bin/mvn clean test -Dcucumber.options="--tags ~@ignore --tags @login"

    if [ $? -eq 1 ]; then
       /usr/local/bin/mvn test -Dcucumber.options="@target/rerun.txt"
    fi

exit 0