package com.example.solid_principles.InterfaceSegregationPrinciple;

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot assembles components");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat!");
    }
}
