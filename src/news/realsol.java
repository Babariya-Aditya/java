package news;
import java.util.Scanner;
import java.lang.Math;
public class realsol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        System.out.println("enter the value of c");
        int c=sc.nextInt();
        int d=(b*b)-4*(a*c);
        if (d<0){
            System.out.println("no real sol");
        }
        else {
            double n1=(b-Math.pow(d,0.5))/(2*a);
            double n2=(b+Math.pow(d,0.5))/(2*a);

            System.out.println("the solutions are"+n1+n2);

        }

    }

}
