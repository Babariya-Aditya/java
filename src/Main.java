import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text");
        String text = sc.nextLine();
        int charCount = text.length();
        int lineCount = text.split("\n").length;
        int wordCount = text.split("\s+").length;
        System.out.println("number of characters: "+ charCount);
        System.out.println("number of characters: "+ lineCount);
        System.out.println("number of characters: "+ wordCount);

    }
}