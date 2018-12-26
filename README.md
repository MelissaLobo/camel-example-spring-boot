Sample Camel project with Spring-boot
-------------
[Apache Camel](http://camel.apache.org/) is a powerful open source integration framework based on known
Enterprise Integration Patterns with powerful Bean Integration.


## Prerequisites

- JDK 1.8, _http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html_

## How to run

You can run this example using

    mvn clean install spring-boot:run

## Frameworks and Technologies

[Java](https://www.java.com/pt_BR)
[Maven](https://maven.apache.org)<br/>
[Spring](http://projects.spring.io/spring-framework)<br/>

## Boas Praticas
Inspirada em _GRASP_ e _S.O.L.I.D_ foram criadas algumas praticas fundamentais para uma boa legibilidade e facilidade de construcao de codigo em _Camel_ 

### Package and Graph
* Project
    + Rest
    + Rout
    + Predicate
    + Controller
    + Service
    + Exception
    
### Project

It is the package that any application must be created, it contains the Class `Application` and other project _packages_.

### Rest

Contains classes that represent the definition of the web interface
    
+ URL
+ HTTP Method
+ Input data type
+ Output data type
+ Camel DSL
+ Others
    
### Route 

This package is intended to make external calls

+ Other APIs
+ Database
+ Others

### Predicate 

+ Data Validations
+ Decisions on the Camel Route
+ Java language and exchange object

### Controller

This package is where the java logic is, responsible for sorting and controlling operations on data. When pure java is more efficient than DSL

### Service

+ Carry out information processing
+ Manually connecting a database
+ Math operations
+ Database transformations
+ Others
    
### Exception

+ Individual handling of exceptions
    
### Other Classes

There are more complex cases, so encapsulate specific decisions and functionalities on individual routes, always maintaining cohesion.

## More information

You can find more information about Apache Camel at the website: http://camel.apache.org/
