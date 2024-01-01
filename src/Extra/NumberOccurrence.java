package Extra;/* Name: Hevin Vadodariya
Assignment: Area of triganle / A1_991708242_Hevin
Program: Computer System Technology, Software Development and Networking engineering

Description: The above program is written in Java and prompts the user to enter integers
between 1 and 100 ending with 0. The results are then displayed in ascending order after
counting the number of times each number appears. For instance, the software will output
that 1 appears once, 2 appears twice, and 3 appears once if the user enters 1, 2, 3, 2, 0.
The output will say "times" to show that a number appears more than once if it does.*/

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        // Initialize an array to store the occurrences of each integer
        int[] counts = new int[101];

        //User inputs the number ending with 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers between 1 and 100, ending with 0:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;  //
            }
            counts[num]++;
        }
        for(int i=1;i<counts.length;i++){
            System.out.println(counts[i]);
        }


//        // Display the counts for each integer
//        for (int i = 1; i <= 100; i++) {
//
//            if (counts[i] > 0) {
//                if (counts[i] == 1) {
//                    System.out.println(i + " occurs 1 time");
//                } else {
//                    System.out.println(i + " occurs " + counts[i] + " times");
//                }
//            }
//        }
   }
}
