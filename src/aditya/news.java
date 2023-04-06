package aditya;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;
public class news {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("hello");
        l.add("hii");
        l.add(1, "who?");
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        String s = "aditya";
        String a = "babariya";

        System.out.println(s.concat(a));
        StringTokenizer c = new StringTokenizer("hello how are you");
        while (c.hasMoreTokens()) {
            System.out.println(c.nextToken());
        }
        System.out.println(s.indexOf("t",2));
    }
}
