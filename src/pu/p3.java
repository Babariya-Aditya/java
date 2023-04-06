package pu;

class ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

class BitwiseOperations {
    public int and(int a, int b) {
        return a & b;
    }

    public int or(int a, int b) {
        return a | b;
    }

    public int xor(int a, int b) {
        return a ^ b;
    }

    public int not(int a) {
        return ~a;
    }

    public int leftShift(int a, int b) {
        return a << b;
    }

    public int rightShift(int a, int b) {
        return a >> b;
    }
}

public class p3 {
    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();

        int sum = arithmetic.add(10, 20);
        int difference = arithmetic.subtract(10, 20);
        int product = arithmetic.multiply(10, 20);
        int quotient = arithmetic.divide(10, 20);

        int and = bitwise.and(10, 20);
        int or = bitwise.or(10, 20);
        int xor = bitwise.xor(10, 20);
        int not = bitwise.not(10);
        int leftShift = bitwise.leftShift(10, 2);
        int rightShift = bitwise.rightShift(10, 2);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("XOR: " + xor);
        System.out.println("NOT: " + not);
        System.out.println("Left shift: " + leftShift);
        System.out.println("Right shift: " + rightShift);
    }
}


