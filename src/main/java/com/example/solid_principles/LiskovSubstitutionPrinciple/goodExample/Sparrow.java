package com.example.solid_principles.LiskovSubstitutionPrinciple.goodExample;

class Sparrow extends FlyingBird {
    public void eat() {
        System.out.println("Sparrow eats seeds.");
    }

    public void fly() {
        System.out.println("Sparrow flies high.");
    }
}