package pu;
import java.util.*;
public class p21
   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {

            System.out.println("invalid input"+e);
            return;
        }
        System.out.println("Enter second number: ");
        int b;
        try {
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input "+e);
            return;
        }
        try {
            int result = a/ b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException:   Cannot divide by zero."+e);
        } finally {
            scanner.close();
            System.out.println("all exceptiion are handled");
        }
    }
}

