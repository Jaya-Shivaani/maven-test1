package com.example.javamavenjunithelloworld;

public class Utility {

    // a. Check if number is odd or even
    public static void checkOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    // b. Check divisibility by 2
    public static void divisibleBy2(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2");
        } else {
            System.out.println(number + " is not divisible by 2");
        }
    }

    // Check divisibility by 3
    public static void divisibleBy3(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 3");
        }
    }

    // Check divisibility by 4
    public static void divisibleBy4(int number) {
        if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4");
        } else {
            System.out.println(number + " is not divisible by 4");
        }
    }

    // Check divisibility by 5
    public static void divisibleBy5(int number) {
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
    }

    // Check divisibility by 6
    public static void divisibleBy6(int number) {
        if (number % 6 == 0) {
            System.out.println(number + " is divisible by 6");
        } else {
            System.out.println(number + " is not divisible by 6");
        }
    }

    // Check divisibility by 7
    public static void divisibleBy7(int number) {
        if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7");
        } else {
            System.out.println(number + " is not divisible by 7");
        }
    }

    // Check divisibility by 8
    public static void divisibleBy8(int number) {
        if (number % 8 == 0) {
            System.out.println(number + " is divisible by 8");
        } else {
            System.out.println(number + " is not divisible by 8");
        }
    }

    // c. Compare two numbers
    public static int biggerNumber(int a, int b) {
        return a > b ? a : b;
    }

    // d. Find biggest among three numbers
    public static int biggestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // e. Print numbers from 1 to 10
    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // f. Check leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

    // g. Add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // h. Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // i. Divide two numbers
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return (double) a / b;
    }

    // j. (a + b)^2
    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // k. Area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Area of square
    public static double areaOfSquare(double side) {
        return side * side;
    }

    // m. Area of rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // n. Area of triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Square root
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                "Square root of negative number is not supported"
            );
        }

        return Math.sqrt(number);
    }
}