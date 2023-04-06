package news;
import java.util.Scanner;
public class trys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int a=0;
        try {
            System.out.println("enter the value of a");
             a=sc.nextInt();

        } catch (Exception e) {
            System.out.println("invalid input"+e);
        }
        int b=0;
        try{
            System.out.println("enter the value of b");
            b=sc.nextInt();
        }
        catch(Exception e){
            System.out.println("invalid input"+e);
        }
        try {

            int c=a/b;
            System.out.println(c);

        }catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("program isd runned");
        }


    }
}
