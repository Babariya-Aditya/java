package inheritance;

class C{
    void display(){
        System.out.println("hey hi how r u");
    }

}
class D extends C{
    void fun(){
        System.out.println("aditya hii");
    }
}
class E extends D{
    void fu(){
        System.out.println("hey shd");
    }
}
public class h2 {
    public static void main (String []args){
        E s=new E();
        s.display();
        s.fun();
        s.fu();
    }

}

