package Extra;

import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text");
        String input=sc.nextLine();
        int characters=input.length();

        int words=input.split("\s").length;

        int line=input.split("\n").length;
        System.out.println("the number of characters in text are: "+characters);
        System.out.println("the total number of words in text are: "+words);
        System.out.println("the total number of lines in text are: "+line);
    }

}
