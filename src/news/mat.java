package news;
import java.util.Scanner;
public class mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int m = sc.nextInt();
        System.out.println("enter the size of coloumn");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] arr1 = new int[m][n];
        int[][] arr3 = new int[m][n];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the element at position" + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the element at position" + i + j);
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + arr1[i][j]);
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum = sum + arr[i][k] * arr1[k][j];
                }
                arr3[i][j] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {

                }
                System.out.print("\t"+arr3[i][j]);

            }
            System.out.println("\n");
        }
    }
}
