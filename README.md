# Kata: Library Management System
### Objective
##### Create a simple library management system that allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.


## Features

- **Add Books**: Add new books to the library with unique identifiers (ISBN), title, author, and publication year.
- **Borrow Books**: Borrow books from the library if they are available.
- **Return Books**: Return borrowed books and update their availability.
- **View Available Books**: View a list of all available books in the library.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 11 or higher installed.
- **JUnit**: For running the tests, JUnit 5 is used.

### Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/234Kavya/library-management-system-incubyte-tdd.git
    ```

2. **Navigate to the Project Directory**:
    ```bash
    cd library-management-system-incubyte-tdd
    ```

3. **Build the Project**:
    You can use Maven or Gradle to build the project. Ensure you have Maven or Gradle installed.

    **With Maven**:
    ```bash
    mvn clean install
    ```

    **With Gradle**:
    ```bash
    gradle build
    ```

### Running the Application

- **Compile and Run**:
    After building the project, you can compile and run the main application. 

- **Run Tests**:
    To ensure that everything works as expected, run the tests:
    
    **With Maven**:
    ```bash
    mvn test
    ```

    **With Gradle**:
    ```bash
    gradle test
    ```

## Code Structure

- `src/main/java/` - Contains the main application code.
  - **`Book.java`** - Represents a book in the library.
  - **`Library.java`** - Manages the collection of books and operations like adding, borrowing, and returning books.

- `src/test/java/` - Contains the test cases.
  - **`BookTest.java`** - Tests for the `Book` class.
  - **`LibraryTest.java`** - Tests for the `Library` class.

## Test Coverage

Below is the test coverage report for the project:
<img width="559" alt="image" src="https://github.com/user-attachments/assets/a4b11553-9ee4-4d86-ac86-f2173fcef6c7" />



## Author 
- [Kavya Kothari](https://www.linkedin.com/in/kavya-kotharii/)


