# Capstone_DevOps_Integration
  #This project won't run on a local machine because the application.properties is modified for the sake of deploying to kubernetes cluster.

# Capstone Employee

This is a Spring Boot project that provides a RESTful API for managing employees. It is deployed on a Kubernetes cluster using Jenkins pipeline.

## Getting Started

### Prerequisites

Before running this project, make sure you have the following prerequisites installed:

- Java 11
- Docker
- Kubernetes
- Jenkins

### Installing

1. Clone the project from GitHub:

```
git clone https://github.com/Sahilgetjob/Capstone_DevOps_Integration.git
```

2. Build the project using Gradle:

```
cd capstone-employee
./gradlew clean build -x test
```

3. Build the Docker image:

```
docker build -t <your-dockerhub-username>/capstone-k8s-pipeline:latest .
```

4. Push the Docker image to Docker Hub:

```
docker push <your-dockerhub-username>/capstone-k8s-pipeline:latest
```

5. Deploy the application to a Kubernetes cluster using the provided deployment and service YAML files:

```
kubectl apply -f app-deployment.yaml
```

## API Endpoints

This application provides the following RESTful API endpoints:

- `GET /api/v1/{employeeId}`: Get an employee by ID


## Contributing

Contributions are always welcome! If you have any suggestions or find any issues, please feel free to open an issue or submit a pull request.
