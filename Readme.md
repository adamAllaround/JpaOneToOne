# Bi-directional one to one JPA entity mapping with Hibernate

This repository presents how to set up one to one entity mapping with JPA annotations. 
Entity relation between Person and Passport classes is the basis of code example.

*You can find an extensive description about how this mapping works, and why its useful on [allAroundJava blog](https://allaroundjava.com/jpa-one-to-one-hibernate/).*

Code example uses log4j2 library to show what SQL statements are being executed. Feel free to clone the repo and launch the test class to understand how Hibernate handles many to one mapping select and insert queries.

## Running the project
* Clone the repository to your environment
* run ```mvn clean install -DskipTests``` This should download the h2 database dependency into your maven directory
* go to your home directory. On linux this will be ```cd /home/[youor username]```
* navigate to h2 database maven directory ```cd .m2/repository/com/h2database/h2/1.4.197```
* run the h2 jar with ```java -jar h2-1.4.197.jar```
* in h2 configuration page configure the database to run as Generic H2 (Server)
* navigate to project directory and run ```mvn clean install```
