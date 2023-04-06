package news;
import java.util.Scanner;
class c{
    void display(){
        System.out.println("helo");
    }
}
class d extends c{
    void display(){
        System.out.println("hii");
        super.display();
    }
}
public class orid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        c a=new c();
//        a.display();
        d w=new d();
        w.display();

    }
}
