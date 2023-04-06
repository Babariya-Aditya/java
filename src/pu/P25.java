package pu;
import java.util.ArrayList;
import java.util.Scanner;
public class P25{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter number of elements you want to enter: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a element in the array" +" "+ (i + 1) + " : ");
            int element = sc.nextInt();
            array.add(element);
        }
        System.out.println("Contents of Array Object : " + array);
    }
}



