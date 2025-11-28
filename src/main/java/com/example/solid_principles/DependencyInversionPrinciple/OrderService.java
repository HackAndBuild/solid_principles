package com.example.solid_principles.DependencyInversionPrinciple;

class OrderService {
    private EmailNotification emailNotification = new EmailNotification();

    public void placeOrder() {
        System.out.println("Order Placed Successfully!");
        emailNotification.sendEmail("Your order is confirmed!");
    }
}
