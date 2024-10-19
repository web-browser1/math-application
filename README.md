# Math Microservices Application

This project contains four separate microservices for performing various mathematical operations. Each microservice is deployed using **Kubernetes** and containerized with **Docker**. The services are:

1. **Addition, Subtraction, Division Microservice**: Provides basic arithmetic operations.
2. **Square Root, Square Microservice**: Handles square root and square calculations.
3. **Trigonometric Microservice**: Provides trigonometric calculations (Sin, Cos, Tan).
4. **Area Calculation Microservice**: Computes areas of geometric shapes (Triangle, Square, Sphere).

## Table of Contents
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Microservices Endpoints](#microservices-endpoints)
- [Docker and Kubernetes Setup](#docker-and-kubernetes-setup)
- [Using the API](#using-the-api)
- [License](#license)

## Installation

### Prerequisites
- **Java 11** or higher
- **Docker** installed ([Download Docker](https://docs.docker.com/get-docker/))
- **Kubernetes (kubectl)** installed ([Install kubectl](https://kubernetes.io/docs/tasks/tools/))
- **Maven** installed ([Install Maven](https://maven.apache.org/install.html))

### Clone the Repository
```bash
git clone https://github.com/your-username/math-microservices.git
cd math-microservices
