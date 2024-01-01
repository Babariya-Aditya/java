package ERP;

import java.util.Scanner;

public class Arrayindex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the integer");
        int a=scanner.nextInt();
        int reverse=0;
        int remainder;
        int absNum=Math.abs(a);

       while(absNum>0){
           remainder =  absNum%10;
            reverse=reverse*10+remainder;
           absNum/=10;
       }
       if(a<0){
           reverse=-reverse;
       }
        System.out.println(reverse);

       // System.out.println(reverse);




    }
}
