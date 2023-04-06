package news;
import java.util.Scanner;
import java.util.ArrayList;
public class alist {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            int element=sc.nextInt();
            arr.add(element);
        }
        System.out.println(arr);
        System.out.println("enter the index to be search");
        int search =sc.nextInt();
        int element=arr.indexOf(search);
        System.out.println(element);
        arr.remove(search);
        System.out.println(arr);


    }

}
