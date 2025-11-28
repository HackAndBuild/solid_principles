package com.example.solid_principles.openAndCloseprinciple;

import lombok.Data;

@Data
class Circle implements Shape {
    private double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
