package news;
class A{
    String name;
    int id;
    void method(int id){
        System.out.println(id);
    }
    void method(String name){
        System.out.println(name);
    }
}
public class over {
    public static void main(String[] args) {
        A a=new A();
        a.method(77);
        a.method("Adi");
    }
}
