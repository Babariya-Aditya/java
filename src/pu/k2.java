
package pu;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class k2
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the List");
        int n= sc.nextInt();

        ArrayList<Integer> str =new ArrayList<Integer >();
        for(int i=0;i<n;i++)
        {

            System.out.println("enter the string");
            int s1=sc.nextInt();

            str.add(s1);
        }
        System.out.println(str);
        Collections.sort(str);
        System.out.println(str);
}
}
