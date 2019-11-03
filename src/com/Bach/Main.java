package com.Bach;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator CircleComparator = new CircleComparator();
        Arrays.sort(circles, CircleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(4.6, 7.5);
        rectangles[2] = new Rectangle(3.6, 5.6, "yellow", true);
        System.out.println("Pre-sorted: ");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        Comparator RectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, RectangleComparator);

        System.out.println("After-sorted: ");
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(7.9);
        squares[2] = new Square(5.8, "yellow", true);
        System.out.println("Pre-sorted: ");
        for(Square square : squares){
            System.out.println(square);
        }

        Comparator SquareComparator = new SquareComparator();
        Arrays.sort(squares, SquareComparator);

        System.out.println("After-sorted: ");
        for(Square square : squares){
            System.out.println(square);
        }

    }
}
