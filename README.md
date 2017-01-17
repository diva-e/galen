# Galen Example #

## Setup ##
Copy website/index.html to your local webserver, to make it accessible at http://localhost:80/index.html


## Galen Syntax ##
 > ### How to install Galen ###
 > 
 > #### Via NPM ####
 >
 > npm install -g galenframework-cli
 >
 > #### Download Binary ####
 >
 > Go to http://galenframework.com/download/ and download Binary
 >
 > Execute install.sh or install.bat 
 
 > ### How to execute tests ###
 >
 > cd galentests
 > 
 > galen test localhost.test --htmlreport reports

## Java Syntax ##

 > ### How to execute tests ###
 >
 > cd javatests
 > 
 > mvn test

## Gulp Galen Syntax ##
 > ### How to execute tests ###
 >
 > cd gulptests
 >
 > npm install
 >
 > gulp test:galen