package news;
import java.util.Scanner;
public class arms {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  number");
        int a=sc.nextInt();
        int b=a;
        int temp,total=0;
        while (b!=0){
            temp= b%10;
            total=total+temp*temp*temp;
            b /=10;

        }
        if(total==a){
            System.out.println(" an armstrong");
        }
        else
            System.out.println("is not armstrong");
    }
}
