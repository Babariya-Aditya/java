package Extra;


import java.util.Scanner;

public class NumberOccur {



    public static void main(String[] args) {
        int[] counts = new int[101];

        //User inputs the number ending with 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers between 1 and 100, ending with 0:");
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            counts[i]++;
        }
        for(int i=1;i<101;i++){


        }




    }
}

