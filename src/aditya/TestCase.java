package aditya;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int number=s.nextInt();
       if(number>=18 && number<=30){
           System.out.println("Valid");
       }
       else {
           System.out.println("Invalid");
       }


    }
}
