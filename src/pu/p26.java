package pu;
import java.util.ArrayList;
import java.util.*;

public class p26  {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            numbers.add(i*10);
        }
        System.out.println("ArrayList after add operation: " + numbers);

        int search = 30;
        if (numbers.contains(search)) {
            System.out.println(search + "   is in the ArrayList");
        } else {
            System.out.println(search + "  is not found in the ArrayList");
        }

        // Remove operation
        int remove = 10;
        if (numbers.remove(Integer.valueOf(remove))) {
            System.out.println(remove + "  is removed from the ArrayList");
        } else {
            System.out.println(remove + " is not found in the ArrayList");
        }
        System.out.println("ArrayList after remove operation: " + numbers);
    }
}









