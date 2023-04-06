package aditya;
import java.util.*;
  class Overload{
    int r;
    int marks;
    String name;
    Overload(int r,int marks,String name){
        this.marks=marks;
        this.r=r;
        this.name=name;
    }
    Overload(int r,String name){
        this.r=r;
        this.name=name;

    }
    void info(int r,int marks,String name){
        System.out.println("roll number= "+r+ "marks= "+marks+"name= "+name);

    }
    void info (int r,int marks){
        System.out.println("roll number ="+r+"name="+marks);
    }


}
public class overloading {

    public static void main(String []args){
        Overload s1=new Overload (25,54,"aditya");
        Overload s2=new Overload(26,"harsh");
        s1.info(24,2);
        s1.info(21,78,"sfs");







    }
}
