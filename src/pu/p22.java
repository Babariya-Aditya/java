package pu;

import java.util.*;

class InvalidCredentialsException extends Exception {
    String msg;
    InvalidCredentialsException(String msg) {

        super(msg);
        this.msg=msg;
    }


    @Override
    public String toString() {
        return msg;
    }
}

public class p22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id");
        String id = sc.next();
        System.out.println("enter the password");
        String password = sc.next();
        try {
            if(id!="user1" || password!="1234"){
                throw new InvalidCredentialsException("no such user with username - "+id);
            }
        }
        catch(InvalidCredentialsException ex) {

            System.out.println(ex);

            System.out.println(ex.getMessage());
        }
    }
}

