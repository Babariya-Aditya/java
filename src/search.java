import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] a = new int[5];
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

        System.out.println("enter the value of x");
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("found number " + (i + 1));
                flag = 1;

            }

        }
        if (flag == 0) {
            System.out.println("element not found");
        }

    }
}
