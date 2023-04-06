package pu;
import java.util.Scanner;
public class p17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter the  text: ");
            String text = scanner.nextLine();
            int characters = text.length();
            int words = text.split("\\s+").length;
            int lines = text.split("\n").length;
            System.out.println("Number of characters are : " + characters);
            System.out.println("Number of words are : " + words);
            System.out.println("Number of lines are : " + lines);
        }
    }
}

