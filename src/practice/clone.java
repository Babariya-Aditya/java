package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class clone {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in 1st");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(i * 10);
        }
        System.out.println("ArrayList  " + numbers);
        ArrayList<Integer> clone = numbers;
        System.out.println(numbers);
        System.out.println("clone array list "+clone);
    }
}
