package pu;
import java.util.Scanner;

public class p7 {
    public static boolean isPrime(int n) {
        if(n<1){
            return false;
        }
        for (int i = 2; i <=n/2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the maximum integer: ");
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();

        System.out.println("the prime numbers upto"+num);
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+"\n");
            }
        }



    }
}

