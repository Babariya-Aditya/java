package assignment;

class Product
{
    int ProductID;
    String ProductName;
    int ProductPrice;
    static int count=0;


    Product()
    {
        count++;
    }
    Product(int pid, String pname,int pprice)
    {
        this.ProductID = pid;
        this.ProductName = pname;
        this.ProductPrice = pprice;
        count++;
    }

    public String toString()
    {
        return "ProductId : "+ProductID+"\n"+"ProductName : "+ProductName+"\n"+"ProductPrice : "+ProductPrice+"\n";
    }


    static int Number()
    {
        System.out.print("objects created are :");
        return count;
    }
}
public class L4
{
    public static void main(String[] args)
    {
        Product p1 = new Product(451,"bid",1100);
        Product p2 = new Product(143,"aid",14500);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.Number());
    }
}

