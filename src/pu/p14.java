package pu;
interface Ab{
    void display();
}
interface Bc extends Ab{
    void fun();
}
  class Cd implements Bc{

     @Override
     public void display() {
         System.out.println("good morning ");

     }

     @Override
     public void fun() {
         System.out.println("hello how are you...");

     }
 }
public class p14 {
    public static void main(String[] args){
        Cd a=new Cd();
        a.fun();
        a.display();
    }
}
