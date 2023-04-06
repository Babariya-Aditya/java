package hello;
import java.util.Scanner;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int sum = 0;
        System.out.print("fibbonaci series: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
            if (c % 2 == 0) {
                sum =sum+ c;
            }
        }
        System.out.println("\n even sum " + sum);
    }
}



