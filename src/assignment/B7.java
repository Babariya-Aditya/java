package assignment;
class Base
{
    public void display()
    {
        System.out.println("Base class display method is called");
    }
}
class Derive1 extends Base
{
    public void display()
    {
        System.out.println("Derive1  method is called");
    }
}
class derive2 extends Base
{
    public void display()
    {
        System.out.println("Derive2  method is called");
    }
}
public class B7
{
    public static void main(String[] args)
    {
        Base ptr;
        Derive1 dl = new Derive1();
        derive2 d2 = new derive2();
        ptr = dl;
        ptr.display();
        ptr = d2;
        ptr.display();
    }
}


