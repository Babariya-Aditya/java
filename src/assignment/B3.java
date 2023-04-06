package assignment;

abstract class A{
    int a;

    abstract void get(int a);


}
class B extends A{

    @Override
    void get(int a) {
        this.a=a;
        System.out.println("the number is = "+a);
    }


}
public class B3 {
    public static void main(String[] args) {
        B b=new B();
        b.get(6);
    }
}
