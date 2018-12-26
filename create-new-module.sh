#!/bin/sh
module_name=$1

# turn off history substantiation
set +H

if [[ -z ${module_name} ]]
then
    echo "1st param module_name is mandatory."
    exit 1
fi

module_name=${module_name// /-}
module_name=${module_name//./}
module_name=${module_name,,}

problem_no=${module_name%%-*}

while [[ ${#problem_no} -lt 4 ]];
do
  problem_no=0${problem_no}
done
module_name=${problem_no}-${module_name#*-}

echo ${module_name}

if test -e ${module_name}
then
    echo "${module_name} exists."
    exit 1
fi

MODULE_PLACE_HOLDER="<!--MODULE PLACE HOLDER-->"
sed -i "s/${MODULE_PLACE_HOLDER}/<module>${module_name}<\/module>\n        ${MODULE_PLACE_HOLDER}/g"  pom.xml

mkdir ${module_name}
cd ${module_name}

echo  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>
<project xmlns=\"http://maven.apache.org/POM/4.0.0\"
         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"
         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">
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
    def \"test\"() {
        setup:
        def solution = new Solution()

        when:

        then:
    }
}" >> src/test/groovy/SolutionTest.groovy

echo "
public class Solution {
    
}" >> src/main/java/Solution.java

echo "${module_name} created!"

