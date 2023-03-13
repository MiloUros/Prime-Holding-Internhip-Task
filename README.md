# Prime-Holding-Internhip-Task


## Getting Started

To run the application, follow these steps:

Clone the repository to your local machine: git clone https://github.com/MiloUros/Prime-Holding-Internhip-Task.git \
Open the project in your preferred IDE (such as Eclipse or IntelliJ IDEA) Here u can download [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows "IntelliJ") \
To start this application u will need to instal Docker. Here's a [link](https://www.docker.com/products/docker-desktop/ "Docker Download") to the instalation file. \
Here is a [link](https://www.youtube.com/watch?v=5nX8U8Fz5S0&ab_channel=Simplilearn "Docker Instalation") to a simple guide on how to instal Docker on your machine. \
Use a REST client (such as Postman) to make HTTP requests to the API endpoints. (Postman donwload [link](https://www.postman.com/downloads/ "Postman Download")) \
Here is a [link](https://www.postman.com/planetary-rocket-271894/workspace/public-workspace/collection/17856139-7c866e58-2902-4a5e-95bb-07f74b5a0877?action=share&creator=17856139 "Postman Collection") to a Postman collection with REST API calls I created. \
When u clone this project to your preferred IDE, and star up docker, in the Terminal u need to navigate to a Docker folder in this project. The location is {This is the place where u cloned the project}\PrimeHolding\src\main\docker. U can use cd command to change directories. By default, the directory is set to your application folder so u will just need to type this command to navigate to docker foler: cd src/main/docker. \
If u are navigated to docker folder just type command: docker compose up and the application will start. 


## Folder Structure Overview

Well the logic in my application architecture is that it describes it's self. Every folder name describes it's purpose. It's easy to read and navigate trough.\
We can divide a software project into 4 layers: Presentational Layer, Business Layer, Data Access Layer and Infrastructure Layer. I tend to keep all my folders, files and classes simple, and to follow this logic.
It's a standard Maven projcet design.

### The Root Directory

-PrimeHolding/pom.xml – defines dependencies and modules needed during the build lifecycle of a Maven project \
-PrimeHolding/src/main – contains source code and resources that become part of the artifact \
-PrimeHolding/src/test – holds all the test code and resources 

### The src/main Directory

-src/main/java – Java source code for the artifact \
-src/main/resources – configuration files and others such as i18n files, per-environment configuration files, and XML configurations \
-src/main/docker – contaning all the elements neaded to run Docker 


## Description of the additional functionalities

The idea behind the additional functionalities I added to this project is that we can build a simple Web Application. I added a new Entity named User. The idea is thas we can have multiple users stored in our database and we can restrict the access to the API calls by giving them Roles(ADMIN, USER, MODERATOR...)
So we can have an application where, based on your access level u can do diferent things. 


