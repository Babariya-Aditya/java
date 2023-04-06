package aditya;
import java.util.*;
public class prac {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int [] [] a= new int[m][n];
//        for(int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("enter the array at index "+i+j);
//                a[i][j] = sc.nextInt();
//            }
//        }
//        for (int i=0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print( "\t"+a[i][j]);
//            }
//           System.out.println("\n");
//        }
        ArrayList<String> a=new ArrayList<>();
        System.out.println("enter the size");
        int c=sc.nextInt();
        for (int i=0;i<=c;i++){
            String st=sc.nextLine();
            a.add(st);
        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}
