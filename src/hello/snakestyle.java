package hello;

import java.util.Scanner;

public class snakestyle {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int n= sc.nextInt();
        System.out.println("enter the size of cploum");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        int matrix1[][]=new int[n][m];
        int c[][]=new int[n][m] ;
        int a=0;
        int sum=0;


        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the values"+i+j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++){
                 System.out.print("\t"+matrix[i][j]);

            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for(int i = 0; i < n; i++){
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("\t"+matrix[i][j]);
                }
                System.out.print("\n");
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print("\t"+matrix[i][j]);

                }
                System.out.print('\n');
            }
        }







    }
}


