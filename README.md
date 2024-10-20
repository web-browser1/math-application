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

```
---



## Running the Application

Once the deployments are complete, Kubernetes will manage the microservices. Each service will be exposed with a LoadBalancer type, allowing access via their IP address or hostname.

To get the service IP, run the following command:

```bash
kubectl get services

```


---

### **Microservices Endpoints**

## Microservices Endpoints

1. **Addition, Subtraction, Division Microservice**

   - Addition: `/add?a=10&b=5`
   - Subtraction: `/subtract?a=10&b=5`
   - Division: `/divide?a=10&b=5`

   **Example**:  
   `http://<EXTERNAL-IP>/add?a=10&b=5`

2. **Square Root, Square Microservice**

   - Square Root: `/sqrt?a=16`
   - Square: `/square?a=5`

   **Example**:  
   `http://<EXTERNAL-IP>/sqrt?a=16`

3. **Trigonometric Microservice**

   - Sin: `/sin?a=45`
   - Cos: `/cos?a=45`
   - Tan: `/tan?a=45`

   **Example**:  
   `http://<EXTERNAL-IP>/sin?a=45`

4. **Area Calculation Microservice**

   - Triangle Area: `/triangle?base=5&height=10`
   - Square Area: `/square?side=5`
   - Sphere Area: `/sphere?radius=5`

   **Example**:  
   `http://<EXTERNAL-IP>/triangle?base=5&height=10`



## Docker and Kubernetes Setup

### Docker Commands

After building the images with Docker, you can run them locally to test the microservices before deploying to Kubernetes.

## Run Addition, Subtraction, Division Microservice
docker run -p 8081:8080 addsub

## Run Square Root, Square Microservice
docker run -p 8082:8080 sqrt

## Run Trigonometric Microservice
docker run -p 8083:8080 trig

## Run Area Calculation Microservice
docker run -p 8084:8080 area



## Scale the number of pods
kubectl scale deployment addsub-deployment --replicas=5

## Check pod status
kubectl get pods

## Check service endpoints
kubectl get services

---

### **Using the API**

## Using the API

You can use Postman, Curl, or any HTTP client to interact with the API.

**Example using curl**:
```bash
curl "http://<EXTERNAL-IP>/add?a=10&b=5"
```

---

### **License**

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.




