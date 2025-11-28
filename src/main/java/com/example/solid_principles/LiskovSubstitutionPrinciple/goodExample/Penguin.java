package com.example.solid_principles.LiskovSubstitutionPrinciple.goodExample;

class Penguin extends Bird {
    public void eat() {
        System.out.println("Penguin eats fish.");
    }

    public void swim() {
        System.out.println("Penguin swims.");
    }
}