Spring Hibernate Practice Project with Maven

To Run the Project following are the prerequisites

1) Download the Maven and set the Path variable for Maven (search on Internet) so you can use maven from any path using command
   Ensure Maven is installed properly and Environment variable is set by following commad
   
   mvn --version
   
   output something like this:
   
   Apache Maven 3.0.5 (...)
   Maven home: ...
   Java version: 1.8.0_60, vendor: Oracle Corporation
   Java home: ...
   Default locale: en_US, platform encoding: Cp1252
   OS name: "windows 7", version: "6.1", arch: "amd64", family: "dos"
   
2) Install Git to clone this repository
3) update the config/poc.properties file with the correct Database credentials
4) After cloning the Repository move into the POC directory (cd POC)
   Run the Project using following command:
   
   mvn clean install tomcat7:run
   
   Woooooow done!, Just hit url http://localhost:7777/

