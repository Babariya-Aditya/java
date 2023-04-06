package pu;

import java.util.Scanner;
import java.lang.Math;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The coefficent of X^2:");
        int a = sc.nextInt();

        System.out.print("Enter The coefficent of X:");
        int b = sc.nextInt();

        System.out.print("Enter The value of constant:");
        int c = sc.nextInt();

        int t =((b*b)-4*(a*c));

        if (t<0)
        {
            System.out.println("No real solutions");
        }
        else
        {
            double x1 = (b+Math.pow(t,0.5))/(2*a);
            double x2 = (b-Math.pow(t,0.5))/(2*a);

            System.out.println(String.format("The Roots are %f and %f",x1,x2));

    }
   }
}
