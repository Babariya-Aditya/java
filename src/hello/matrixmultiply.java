package hello;

import java.util.Scanner;

public class matrixmultiply {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int n= sc.nextInt();
        System.out.println("enter the size of coloum");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        int matrix1[][]=new int[n][m];
        int c[][]=new int[n][m] ;

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
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter the values"+i+j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++){
                System.out.print("\t"+matrix1[i][j]);

            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++){
                for(int k=0;k<m;k++){
                    sum=sum+matrix[i][k]*matrix1[k][j];
                }
                c[i][j]=sum;
                sum=0;
            }
        }
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++){
                for(int k=0;k<m;k++) {
                    System.out.print("\t"+ c[i][j]);
                }


            }
            System.out.print("\n");
        }






    }
}
