package Extra;

import java.util.Scanner;

public class bubble {
    public static void main(String args[])
    {
        int[] a = new int[5];
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        for (int i=0;i<a.length;i++ ){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
                }

            }
            System.out.println("the sorted arrayis"+a[i]) ;
            }

        }


    }

