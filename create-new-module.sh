#!/bin/sh
module_name=$1

if test -e ${module_name}
then
    echo "${module_name} exists."
    exit 1
fi

mkdir ${module_name}
cd ${module_name}

echo "<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>parent</artifactId>
        <groupId>com.delong.leetcode</groupId>
        <version>1.0</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>${module_name}</artifactId>

</project>" >> pom.xml

mkdir -p src/main/java
mkdir -p src/main/resources
mkdir -p src/test/groovy

echo "import spock.lang.Specification

class SolutionTest extends Specification {
    def "test"() {
        setup:
        
        when:

        then:
    }
}" >> src/test/groovy/SolutionTest.groovy

echo "
public class Solution {
    
}" >> src/main/java/Solution.java

echo "${module_name} created!"

