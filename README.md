# gRPC Java Sample Project 🚀

This is a simple **gRPC Java project** using **Gradle**, featuring:  
✅ A **gRPC server** that provides a greeting service.  
✅ A **gRPC client** that sends a request to the server.

---

## ⚙️ Prerequisites

Ensure you have the following installed:

- **Java 17+**
- **Gradle 7+**
- **Protobuf Compiler** (auto-handled by Gradle)

---

## 🚀 Setup & Build

### Build the project
```sh
./gradlew build
```

### Generate gRPC classes (Automatically done during build)
```sh
./gradlew generateProto
```

### Running the Server
```sh
./gradlew runServer
```

### Running the Client
```sh
./gradlew runClient
```