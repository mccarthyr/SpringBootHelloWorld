# SpringBootHelloWorld

## Quick Overview

Requires Java 1.8+ and Maven.

To generate the project structure (Maven based) you can use
https://start.spring.io/
Simple download the file and unpack it at the directory you want to run the code from.

All the details you need and what I have use here can be found from the official documentation at:
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-first-application

In the *src/main/java* folder a file called **Example.java** was created (this is the only file that was not generated) which serves as a web REST controller.

In the pom.xml file the web dependency was added also:

```xml 
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

Run "**mvn install**" to install any dependencies in your local Maven repository.

The run "**mvn spring-boot:run**" which will run the embedded Tomcat server that has been installed as part of the dependencies through the spring-boot-started-web artifact. 

Open a web browser at **localhost:8080** and it will display the "Hello World" message. You can also put in localhost:8080/*yourName* and it will display your name back to you. This code comes from the Example.java file.

