package hello;

import java.util.Scanner;

public class he {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows ");
        int r = sc.nextInt();
        System.out.print("enter the number of columns ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("enter the matrix elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("new matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || i == matrix.length - 1 || j == matrix[i].length - 1) {
                    System.out.print( matrix[i][j] );
                }
                else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


