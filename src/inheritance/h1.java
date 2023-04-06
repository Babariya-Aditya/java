package inheritance;

class A{
    void display(){
        System.out.println("hey hi how r u");
    }

}
class B extends A{
    void fun(){
        System.out.println("aditya hii");
    }
}
public class h1 {
    public static void main (String []args){
        B s=new B();
        s.display();
        s.fun();
    }

}
