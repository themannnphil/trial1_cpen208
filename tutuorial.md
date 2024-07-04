A docker file is simply a text file that contains a seqeuence of steps we need Docker to perform in other to build our image layers. like a recipe book, step by step

- ```FROM openjdk:17```# you specify the version for build here  

- ```VOLUME /tmp``` #Specify the base image

- ```EXPOSE 8082 ```# Docker has internal and external port, 

- ```COPY target/cpen208api.jar cpen208api.jar ```# source and destination 

- ```ENTRYPOINT [ "java", "-jar", "cpen208api.jar" ]```# Entry point, when app wants to run where and how does it run it?


 Java environment, type, entry point of executable file

we deploy and build from pom file--clean, compile, install

```docker build -t  cpen208api:latest``` #command to build an application, you specify the name  here# . means you are the drectory of building image

```docker image ls``` #used to check the list of docker image

```docker run  -p 1717:8082 cpen208api:latest```

```-p external port:internal port```
# how to use jenkins to automate this code(Next week)

##Containerization has become a game-changer in the continually changing world of software development today. Containers increase portability and facilitate deployment and management by encapsulating applications and their dependencies into self-contained units. 'Docker', a potent platform that has transformed how we create, package, and distribute software, is at the forefront of containerization technology.

```
pipeline {
    agent any 
    stages {
        stage('Checkout') { 
            steps {
                git url:'https://github.com/themannnphil/trial1_cpen208.git'
            }
        }
        stage('Build') { 
            steps {
                echo ('Build API')
            }
        }
        stage('Build Image') { 
            steps {
               echo ('Build Image')
            }
        }
         stage('Push Image to Doecker Hub') { 
            steps {
               echo ('ush Image to Doecker Hub')
            }
        }
        stage('Deploy') { 
            steps {
                 echo ('Test')
            }
        }
    }
}
``` 
this code is run in the peipline script to describe or drfin automations