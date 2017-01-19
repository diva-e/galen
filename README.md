# Galen Framework Example #
This is a set of demo implementations for the Galen Framework (http://galenframework.com/). There're multiple posibilities to execute the tests:

1. Testsetup written in Galen Syntax. Tests are executed with Galen Binaries
2. Testsetup written in Java. Tests are executed with Maven
3. Testsetup written in JavaScript. Tests are executed with Gulp

The tests are executed against http://localhost:80/index.html. For successful tests, you need to copy the file ```website/index.html``` to your local webserver (somethink like [Pythons SimpleHTTPServer](https://docs.python.org/2/library/simplehttpserver.html), or [XAMPP](https://www.apachefriends.org/de/index.html)).

## 1. Testsetup in Galen Syntax

### How to install Galen

#### a) Via NPM 

```
npm install -g galenframework-cli
```
 
#### b) Download Binary

1. Go to http://galenframework.com/download/ and download Binary
2. Execute ```install.sh```  or ```install.bat```
 
### How to execute tests

```
cd galentests
galen test localhost.test --htmlreport reports
```

## 2. Testsetup in Java + Maven

### How to execute tests

```
cd javatests
mvn test
```

## 3. Testsetup in JavaScript + Gulp

### How to execute tests

```
cd gulptests
npm install
gulp test:galen
```