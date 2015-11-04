# appengine-springboot

To run locally the SpringBoot application:

    mvn package
    mvn exec:java
   

You can then access the following urls:

- http://localhost:8080
- http://localhost:8080/properties

To Deploy to Google App Engine, you first need to install the lastest Cloud SDK from [https://cloud.google.com/sdk](https://cloud.google.com/sdk/?hl=en), and setup your project, then you can execute:

    mvn gcloud:deploy
   


