# Custom Validation Framework

This project implements a basic custom validation framework in Java using annotations.

## Modules

The project consists of two modules:

*   `custom-validation`: This module contains the core validation logic.
    *   `@NotNull`: Annotation to ensure a field is not null.
    *   `@NotBlank`: Annotation to ensure a string field is not null and not empty.
    *   `ValidationEngine`: The class that processes the annotations and performs the validation.
*   `custom-application`: This module shows an example of how to use the validation framework.
    *   `User`: A sample class with fields annotated with `@NotNull` and `@NotBlank`.
    *   `App`: The main class that runs the validation on a `User` object.

## How to Run

1.  **Build the project:**

    Open a terminal in the root directory of the project and run the following Maven command to build the project:

    ```bash
    mvn clean install
    ```

2.  **Run the application:**

    After building the project, you can run the application using the following command:

    ```bash
    java -jar custom-application/target/custom-application-1.0-SNAPSHOT.jar
    ```
