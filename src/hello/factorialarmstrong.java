package hello;
import java.util.Scanner;
public class factorialarmstrong {
    public static void main (String []args ){
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
        int num=fact;
        int n,remainder,total=0;
        n=num;
        while (n!=0){
            remainder=n%10;
            total=total+remainder*remainder*remainder;
            n /=10;
        }
        if( total ==num ){
            System.out.println("is an armstrong number");

        }else {
            System.out.println("is not an armstrong");
        }

    }
}

