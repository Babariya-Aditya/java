package practice;
import java.util.*;

  class abc
{
    private int a,b;
     abc()
    {

        System.out.println("hello");
    }
    abc(int a)
    {
        this.a=a;
    }
    public void setdetail(int b)
    {
        this.b=b;
    }
    public void getdetail()
    {
        System.out.println("value of a:"+a+"\nthe value of b:"+b);

    }
    public String toString()
    {
        return Integer.toString(a);
    }
}
public class Wrapper {
    public static void main(String[] args) {
        abc z=new abc(20);
        System.out.println(z);
    }
}
