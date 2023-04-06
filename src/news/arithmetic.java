package news;

public class arithmetic {
        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            // Arithmetic operations
            int sum = a + b;
            int difference = a - b;
            int product = a * b;
            int quotient = a / b;
            int remainder = a % b;

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);

            // Bitwise operations
            int bitwiseAnd = a & b;
            int bitwiseOr = a | b;
            int bitwiseXor = a ^ b;
            int bitwiseComplementA = ~a;
            int bitwiseLeftShift = a << 1;
            int bitwiseRightShift = a >> 1;
            int bitwiseZeroFillRightShift = a >>> 1;

            System.out.println("Bitwise AND: " + bitwiseAnd);
            System.out.println("Bitwise OR: " + bitwiseOr);
            System.out.println("Bitwise XOR: " + bitwiseXor);
            System.out.println("Bitwise complement of A: " + bitwiseComplementA);
            System.out.println("Bitwise left shift: " + bitwiseLeftShift);
            System.out.println("Bitwise right shift: " + bitwiseRightShift);
            System.out.println("Bitwise zero-fill right shift: " + bitwiseZeroFillRightShift);
        }
    }

