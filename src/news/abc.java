import java.util.ArrayList;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice, element;
        do {
            System.out.println("1. Add element");
            System.out.println("2. remove element");
            System.out.println("3. display element");
            System.out.print("enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.print("enter element to be added: ");
                    element = sc.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.print("enter element to be removed: ");
                    element = sc.nextInt();
                    if (list.remove((Integer) element))
                        System.out.println("element removed");
                    else
                        System.out.println("element not found");

                case 3:
                    System.out.println("elements in the list: " + list);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
