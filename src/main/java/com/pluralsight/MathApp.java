package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        double bobSalary = 30000;
        double garySalary = 52000;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + ".");

        //Question 2
        double carPrice = 52000;
        double truckPrice = 90000;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice + ".");

        // Question 3
        double radius = 7.25;
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle with radius is " + area + ".");

        // Question 4

        double squareRoot = 5.0;
        double result = Math.sqrt(squareRoot);

        System.out.println("The square root of 5.0 is " + result + ".");

        // Question 5

        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;

        double distance = Math.hypot(x2- x1 , y2 - y1);

        System.out.println("The distance between the two points is " + distance + ".");

        // Question 6
        double value = -3.8;
        double abValue = Math.abs(value);

        System.out.println("The absolute value of -3.8 is " + abValue + ".");

        //Question 7
        double randomNumbers = Math.random();

        System.out.println("Here is a random number! " + randomNumbers);

    }
}
