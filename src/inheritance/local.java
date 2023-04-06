package inheritance;
class Z{
    void display(){
        class Y{
            void mag(){
                System.out.println("hello world");
            }
        }
        Y a=new Y();
        a.mag();
    }
}
public class local {
    public static void main(String[]args){
        Z n=new Z();
        n.display();
    }
}
