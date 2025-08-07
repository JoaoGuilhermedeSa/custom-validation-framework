package com.example;

import com.example.validator.NotBlank;
import com.example.validator.NotNull;
import com.example.validator.ValidationEngine;

import java.util.Set;

public class App {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.setName(" ");

        ValidationEngine validationEngine = new ValidationEngine();
        Set<String> errors = validationEngine.validate(user);

        if (errors.isEmpty()) {
            System.out.println("User is valid.");
        } else {
            System.out.println("User is invalid:");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
    }
}

class User {

    @NotNull
    private String name;

    @NotBlank
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}