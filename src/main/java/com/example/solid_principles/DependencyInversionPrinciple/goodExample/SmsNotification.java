package com.example.solid_principles.DependencyInversionPrinciple.goodExample;

public class SmsNotification implements NotificationService{
    @Override
    public void notify(String msg) {
        System.out.println("Sending SMS: "+msg);
    }
}
