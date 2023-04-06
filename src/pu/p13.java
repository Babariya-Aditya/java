package pu;

import java.io.*;
class abc
{
    void function1()
    {
        System.out.println("good morning");
    }
}

class def extends abc
{
    void function2()
    {
        System.out.println("good night");
        super.function1();
    }
}

class abcd extends def
{
    void function(){
        System.out.println("good afternoon");
        super.function2();
    }


}

public class p13
{
    public static void main(String[] args)
    {
        abcd p = new abcd();
        p.function();
    }

}
