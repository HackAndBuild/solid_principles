package com.example.solid_principles.singleResponsePrinciple;

import lombok.Data;

@Data
class User {
    //this is bad handling
    private String name;
    private String email;
    public void saveUser() {
        System.out.println("User saved to database.");
    }
    public void sendEmail(String message) {
        System.out.println("Email sent to " + email + " with message: " + message);
    }
}
