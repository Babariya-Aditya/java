package practice;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        int i;
        for (i = 0; i <a; i++) {
            int i1 = i;
            System.out.println("enter the element");
            array[i] = sc.nextInt();
        }
        System.out.println("enter the index");
        int x=sc.nextInt();
        System.out.println("the given index value is"+array[x]);



    }
}
