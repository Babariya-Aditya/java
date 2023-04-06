package assignment;

import java.io.*;


class Parent
{


    void show()
    {


        System.out.println("Parent  method is called");
    }
}


class Child extends Parent
{


    @Override


    void show()
    {

        // Print message for this class
        System.out.println("Child  method is called");
    }

}


public class B6
{

    // Main driver method
    public static void main(String[] args)
    {

        Parent obj = new Child();


        obj.show();
    }
}
