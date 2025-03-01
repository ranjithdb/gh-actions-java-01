# gh-actions-java-01

## HTTP Status Code Checker with GitHub actions

A simple Java-based command-line tool to check HTTP status code for given URL build and tested with maven.

## 🚀 Features

- Sends HTTP requests to a URL
- Displays the status code of the response

## 🛠 Prerequisites

Before you begin, ensure you have the following installed:

- Java 17.0.14

- Apache Maven 3.8.7

## 🔧 Installation

Build the project:

```sh
mvn package
```

## 🏃 Usage

Run the JAR file with URLs as arguments:

```sh
java -jar target/status-checker-1.0-SNAPSHOT.jar https://example.com
```

## 🧪 Running Tests

To run the test suite:

```sh
mvn test
```

## 🏗 CI with GitHub Actions

This project uses GitHub Actions to:

- Automatically build and test on push

- Use specific versions of Java and Maven for consistency
