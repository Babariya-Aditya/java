import java.util.Scanner;
public class matrixtranspose {
    public static void main(String[] args) {
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

                matrix2[i][j] = matrix1[j][i];
            }
        }
        System.out.println("the Transpose of the matrix is :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print("\t" + matrix2[i][j]);

            }
            System.out.print("\n");
 }
    }
}
