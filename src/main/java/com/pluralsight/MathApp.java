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

    }
}
