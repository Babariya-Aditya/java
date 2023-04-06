package assignment;
class Shape{
    void draw(){
        System.out.println("draw something");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("draw a square");
        super.draw();

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("draw a circle");
        super.draw();
    }
}
class Hexagon extends Shape{
    void draw(){
        System.out.println("draw a hexagon");
        super.draw();
    }
}
public class A2 {
    public static void main(String[]args){
        Square s=new Square();
        Circle c=new Circle();
        Hexagon h=new Hexagon();
        s.draw();
        c.draw();
        h.draw();

    }
}
