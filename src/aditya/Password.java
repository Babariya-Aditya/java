package aditya;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the password");
        String number=s.nextLine();
        if(number.length()>=8 && number.length()<=12){
            System.out.println("invalid");
        }
        else {
            System.out.println("valid");
        }

    }
}


