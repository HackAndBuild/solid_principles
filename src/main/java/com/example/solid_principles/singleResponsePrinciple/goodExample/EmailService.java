package com.example.solid_principles.singleResponsePrinciple.goodExample;

class EmailService {
    //single response
    public void sendEmail(User user, String message) {
        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }
}