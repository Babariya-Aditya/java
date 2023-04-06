package assignment;
import java.util.Scanner;
class Matrix
{
    Scanner sc = new Scanner(System.in);
    int temp[][]={{0,0,0},{0,0,0},{0,0,0}};


    Matrix()
    {

        System.out.println("Matrix");
    }

    Matrix(int a)
    {

    }

    void addition(int[][] a1,int[][] a2)
    {
        int temp[][]={{0,0,0},{0,0,0},{0,0,0}};
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                temp[i][j]=a1[i][j]+a2[i][j];
            }
        }

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }


    }
    //Matrix substraction
    void substraction(int[][] a1,int[][] a2)
    {
        int temp[][]={{0,0,0},{0,0,0},{0,0,0}};
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                temp[i][j]=a1[i][j]-a2[i][j];
            }
        }

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }


    }
    //Matrix multiplication
    void multiplication(int[][] a1,int[][] a2)
    {
        int temp[][]={{0,0,0},{0,0,0},{0,0,0}};
        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    temp[i][j]=temp[i][j]+a1[k][j]+a2[i][k];
                }

            }
        }

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }


    }



}

public class L3 {
    public static void main(String[] args)
    {
        int a1[][] ={{1,2,4},{4,8,6},{1,8,19}};
        int a2[][] ={{14,11,22},{13,13,25},{16,37,28}};
        Matrix M = new Matrix();
        M.addition(a1,a2);
        M.substraction(a1,a2);
        M.multiplication(a1,a2);

    }
}


