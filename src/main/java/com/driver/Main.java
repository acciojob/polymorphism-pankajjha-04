package com.driver;

public class Main {

    public static void main(String[] args) {
        // Task 2: Creating an object of Product
        Product p = new Product();

        // Task 3: Calling the method product(int x, int y)
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4: Calling the overloaded method product(int x, int y, int z)
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Calling the overloaded method product(double x, double y)
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }

    public static class Product {

        // Task 3: Overloaded method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }
}
