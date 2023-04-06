package news;
import java.util.Scanner;

public class palimd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.nextLine();
        int length=st.length();
        String rev = new String();
        for(int i=length-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        if(st.equals(rev)){
            System.out.println("palimdrome");
        }
        else{
            System.out.println("not palimdrome");
        }

    }
}
