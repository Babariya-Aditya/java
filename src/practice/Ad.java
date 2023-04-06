package practice;

class circle
{
    public float radius;
    circle()
    {
        radius = 10;
    }
    circle(float r)
    {
        this.radius=r;
    }
    //override string toString method
    public String toString()
    {
        return radius+" ";
    }
    //override boolean equals
    @Override
    public boolean equals(Object o)
    {
        if(this==o){
            return true;
        }
        circle c = (circle) o;

        return Double.compare(radius,c.radius)==0;
    }
    //this method will return area of circle
    double area(){
        return (3.14)*radius*radius;
    }
    //
    double area(Object o)
    {
        circle c =(circle) o;
        return c.area();
    }
}


public class Ad{
    public static void main(String args[])
    {
        circle obj1 = new circle(10);
        System.out.println(obj1);
        circle obj2 = new circle(20);

        if (obj1.equals(obj2))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
        System.out.println(obj1.area());
        System.out.println(obj2.area(obj2));
    }
}

