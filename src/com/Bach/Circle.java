package com.Bach;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArena() {
        return radius * radius * Math.PI;
    }

    public double getPerometer() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + getRadius() + " , which is subclass of " + super.toString();
    }
}
