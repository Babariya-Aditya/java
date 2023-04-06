package pu;

import java.util.Scanner;
class A{
    void details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name");
        String name =sc.nextLine();
        System.out.println("enter the branch");
        String branch =sc.nextLine();
        System.out.println("enter the address");
        String address =sc.nextLine();
        System.out.println("enter the phone number");
        String phone_number=sc.nextLine();
        System.out.println(name);
        System.out.println(branch);
        System.out.println(address);
        System.out.println(phone_number);

    }
}
//Write a java program to display the employee details using
//Scanner class
public class p4 {
    public static  void main (String [] args){
       A a= new A();
       a.details();


    }
}
