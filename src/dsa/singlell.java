package dsa;
import java.util.*;
public class singlell {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data");
        data=sc.nextInt();
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }

    }
}
