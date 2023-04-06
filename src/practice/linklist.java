package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class linklist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in 1st");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(i * 10);
        }
        System.out.println("ArrayList  " + numbers);
        System.out.println("enter the number of element in 2nd");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            number2.add(i * 10);
        }
        System.out.println("ArrayList  " + number2);

        if(numbers.equals(number2)){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }
      /*  System.out.println("enter the index to remove");

        int x= sc.nextInt();
        numbers.remove(x);
        System.out.println("the array after removing element"+numbers);
        Collections.reverse(numbers);
        System.out.println("the reverse arraylist");
        System.out.println(numbers);*/

    }
}
