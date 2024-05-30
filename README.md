# Spring Retail Management REST API Web App

## Overview
This is a Spring Boot RESTful web application for managing retail operations. The application includes entities such as Customer, Vendor, and Categories. It uses MapStruct for mapping Data Transfer Objects (DTOs) to domain models and Lombok to reduce boilerplate code.

## Technology Stack
- **Spring Boot**: Framework for building Java-based applications
- **Spring Data JPA**: Data access layer
- **MapStruct**: DTO to domain model mapping
- **Lombok**: Reducing boilerplate code
- **H2 Database**: In-memory database for testing
- **Maven**: Build and dependency management
- **Swagger**: API documentation

## Architecture
- Controller Layer: Handles HTTP requests and responses.
- Service Layer: Contains business logic and interacts with the repository layer.
- Repository Layer: Interacts with the database using Spring Data JPA.
- Model Layer: Contains entity classes and DTOs.

## Key Features
- Manage Customers: Create, read, update, and delete customer information.
- Manage Vendors: Create, read, update, and delete vendor information.
- Manage Categories: Create, read, update, and delete category information.
- Use of DTOs and MapStruct for efficient data mapping.
- Use of Lombok to reduce boilerplate code.
- API documentation with Swagger.

## Database Design
#### Entities and Relationships
- **Vendor**
- **Category**
- **Customer**

## API Endpoints

### Customers
- **GET /api/customers**: Retrieve all customers
- **GET /api/customers/{id}**: Retrieve a customer by ID
- **POST /api/customers**: Create a new customer
- **PUT /api/customers/{id}**: Update a customer
- **DELETE /api/customers/{id}**: Delete a customer

### Vendors
- **GET /api/vendors**: Retrieve all vendors
- **GET /api/vendors/{id}**: Retrieve a vendor by ID
- **POST /api/vendors**: Create a new vendor
- **PUT /api/vendors/{id}**: Update a vendor
- **DELETE /api/vendors/{id}**: Delete a vendor

### Categories
- **GET /api/categories**: Retrieve all categories
- **GET /api/categories/{nane}**: Retrieve a category by Name

### Swagger
- localhost:8080/swagger-ui
- localhost:8080/v2/api-docs

## Testing

### Testing Tools
- **JUnit 5**: Framework for writing and running unit tests.
- **Mockito**: Library for mocking dependencies in unit tests.
- **Spring Boot Test**: Provides support for integration testing of Spring Boot applications.
- **MockMvc**: Used for testing Spring MVC controllers.

### Types of Tests
- **Unit Tests:** Using JUnit and Mockito for testing services and controllers.
- **Integration Tests:** Testing the interaction between different layers.
