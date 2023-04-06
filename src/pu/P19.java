package pu;
import java.util.*;
public class P19
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a line of numbers with commas between numbers :");
        String input = s.next();
        StringTokenizer st = new StringTokenizer(input,",");

        int sum = 0;
        while(st.hasMoreTokens())
        {
            int n = 0;
            n = Integer.parseInt(st.nextToken());
            System.out.println("number is: "+n);
            sum += n;
        }
        System.out.println("sum of the numbers is: "+sum);
    }
}
