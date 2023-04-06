package hello;

import java.util.Scanner;

public class MATRIXTRAVAERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("enter the number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("enter the matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

       System.out.println("traverse 270 degrees: ");
        for (int j = c - 1; j >= 0; j--) {
            for (int i = 0; i < r; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

