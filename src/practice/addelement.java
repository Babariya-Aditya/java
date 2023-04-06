package practice;
import java.util.LinkedList;

public class addelement {
    public static void main(String[] args) {
       LinkedList<String> l1=new LinkedList<String>();
        System.out.println("enter the element in linklist");
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        System.out.println(l1);

        l1.add(0,"mango");
        l1.add(4,"fruit");
        System.out.println(l1);



    }
}
