import java.util.Scanner;
public class matrices {
    public static void main(String[] args)
    {
 int flag=1;
 Scanner sc = new Scanner(System.in);
 int a1[][] = new int[3][3];
 int a2[][] = new int[3][3];

        for (int i =0;i<3;i++) {
         for(int j=0;j<3;j++) {
           System.out.println("Enter value of matrix a1:");
           a1[i][j] =sc.nextInt();
          }
       }
         for (int i =0;i<3;i++) {
          for(int j=0;j<3;j++) {
           System.out.println("Enter value of matrix a2:");
            a2[i][j] =sc.nextInt();
           }
         }
          for (int i =0;i<3;i++)
 {
 for(int j=0;j<3;j++)
 {
 if (a1[i][j]!=a2[i][j])
 {
     flag=0;
  }
 }
 }
    if (flag==1)
{
    System.out.println("matrix is equal");
 }
    else
 {
    System.out.println("matrix is not equal");
     }
    }
}

