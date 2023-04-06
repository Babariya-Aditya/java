import java.util.Scanner;
public class county {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lines");
        String st=sc.nextLine();

        int count=st.length();
        int words=st.split("\\s").length;//\\s is single white space
        int lines=st.split("\n").length;
        System.out.println(count);
        System.out.println(words);
        System.out.println(lines);
    }
}