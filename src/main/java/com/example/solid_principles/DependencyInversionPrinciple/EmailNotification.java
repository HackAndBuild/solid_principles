package com.example.solid_principles.DependencyInversionPrinciple;

class EmailNotification {
    public void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }
}

