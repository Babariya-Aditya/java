package dsa;

public class Pattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            for (int k = i-1; k >0; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=i;j<n;j++){
//                System.out.print(" ");
//            }
//            for (int l = 1; l <= i; l++) {
//                System.out.print("*");
//            }
//            for (int k = i-1; k >0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
    }
    }

