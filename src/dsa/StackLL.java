package dsa;
public class StackLL {
 static class Node{
     int data;
     Node next;
     Node(int data){
         this.data=data;
         this.next=null;
     }
 }

    static class Stack {
       static Node head=null;
        boolean isempty(){
            if(head == null){
                return true;
            }
            return false;
        }
         void push(int data){
            Node newnode=new Node(data);
            if(head==null){
                head =newnode;
            }
            newnode.next=head;
            head=newnode;

        }
        static  int  pop(){
            int  top=head.data;
            head=head.next;
            return top;
        }
        static int peek(){
            if(head== null){
                System.out.println("empty");
            }
            return head.data;
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            System.out.println(s.isempty());
            s.push(45);
            s.push(44);
            s.push(88);






        }
    }
}


