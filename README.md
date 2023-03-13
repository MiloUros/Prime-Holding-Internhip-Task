# Prime Holding Internship Task


## Getting Started

Follow the steps below to start the application:

Clone the repository to your local machine: git clone https://github.com/MiloUros/Prime-Holding-Internhip-Task.git \
Open the project in your preferred IDE (such as Eclipse or IntelliJ IDEA) Download IntelliJ [here](https://www.jetbrains.com/idea/download/#section=windows "IntelliJ") \
To run this application, you need to install Docker. Here is a [link](https://www.docker.com/products/docker-desktop/ "Docker Download") to the installation file. \
Here is a [link](https://www.youtube.com/watch?v=5nX8U8Fz5S0&ab_channel=Simplilearn "Docker Instalation") to a simple tutorial on how to install Docker on your machine. \
Use a REST client (like Postman) to make HTTP requests to the API endpoints. (Postman donwload [link](https://www.postman.com/downloads/ "Postman Download")) \
Here is a [link](https://www.postman.com/planetary-rocket-271894/workspace/public-workspace/collection/17856139-7c866e58-2902-4a5e-95bb-07f74b5a0877?action=share&creator=17856139 "Postman Collection") to a Postman collection of REST API calls that I created. \
If you clone this project to your preferred IDE and start Docker, you'll need to navigate in the terminal to a Docker folder in this project. The location is {This is where you cloned the project}\PrimeHolding\src\main\docker. You can use the cd command to change the directories. By default, the directory is set to your application folder, so you only need to type this command to navigate to docker foler: cd src/main/docker. \
Once you have navigated to the docker folder, simply enter the command: docker compose up and the application will start.


## Overview of the folder structure

The logic in my application architecture is that it describes itself. Each folder name describes its purpose. It's easy to read and navigate.
We can divide a software project into 4 layers: Presentation layer, Business layer, Data access layer and Infrastructure layer. I tend to keep all my folders, files and classes simple and follow this logic. It's a standard Maven project design.

### The root directory

-PrimeHolding/pom.xml - defines dependencies and modules needed during the build lifecycle of a Maven project
-PrimeHolding/src/main - contains source code and resources that become part of the artefact
-PrimeHolding/src/test - contains all the test code and resources

### The src/main directory

-src/main/java – Java source code for the artifact \
-src/main/resources – configuration files and others such as i18n files, per-environment configuration files, and XML configurations \
-src/main/docker - contains all the elements needed to run Docker 


## Description of the additional functionalities

The idea behind the additional functionality I added to this project is that we can create a simple web application. I've added a new entity called User. The idea is that we can store multiple users in our database and restrict access to the API calls by assigning them roles (ADMIN, USER, MODERATOR...) This way we can create an application where you can do different things depending on the access level.


