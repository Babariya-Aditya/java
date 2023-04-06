package inheritance;

class H{
    void display(){
        System.out.println("hey hi how r u");
    }

}
class I extends H{
    void fun(){
        System.out.println("aditya hii");
    }
}
class J extends H{
    void fu(){
        System.out.println("hey shd");
    }
}
public class h3 {
    public static void main (String []args){
        I s=new I();
        J s1=new J();
        s.display();
        s.fun();
        s1.fu();
        s1.display();
    }

}


