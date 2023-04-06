import java.sql.SQLOutput;
import java .util.Scanner;
public class identitymatrix {
    public static void main(String args[]) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix :");
        int count = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("enter the values at position");
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print("\t" + matrix1[i][j]);

            }
            System.out.print("\n");
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((i == j && matrix1[i][j] != 1) || (i != j && matrix1[i][j] != 0)) {
                    flag = 0;
                }

            }
        }
        if (flag == 0) {
            System.out.println(" identity");
        } else {
            System.out.println(" not identity matrix");
        }
    }
}
