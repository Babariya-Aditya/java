package dsa;

public class LL {
    int size;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

        Node head = null;

        public void addfirst(String data) {
            size++;
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public void addlast(String data) {
            size++;
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newnode;

        }

        void println(){
            if (head == null) {
                System.out.println("linked list is empty");
                return;
            }
            Node currNode=head;
            while (currNode != null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.print("NULL");
        }
        void deletefirst(){

            if (head == null) {
                System.out.println("linked list is empty");
                return;
            }
            size--;

            head=head.next;
        }
        void deletelast(){
            if (head == null) {
                System.out.println("linked list is empty");
                return;
            }
            size--;
           Node temp=head;
            Node tempnext=head.next;
            while (tempnext.next != null){
                tempnext=tempnext.next;
                temp=temp.next;
            }
            temp.next=null;

        }
        void addmid(int index,String data){
            Node newnode=new Node(data);
            Node temp=head;
            int i=0;
            while (i<index-1){
                temp=temp.next;
            }
            temp.next=newnode.next;
            temp.next=newnode;

        }
        void delemid(int index){
//            Node temp=head;
//            Node ptr=null;
//            int i=0;
//            while (temp !=null&&i<index){
//                ptr=temp;
//                temp=temp.next;
//            }
//
//            ptr.next=temp.next;
//            temp.next=null;
            if(head == null){
                return;
            }

            // handle case where first node is to be deleted
            if (index == 0) {
                head = head.next;
                return;
            }

            Node previous = null;
            Node current = head;
            int count = 0;

            // traverse the list till the node at the index just before the one to be deleted
            while (current != null && count < index) {
                previous = current;
                current = current.next;
                count++;
            }

            // handle case where index is out of bounds
            if (current == null) {
                return;
            }

            // update "next" pointer of node at previous index to point to node after the one to be deleted
            previous.next = current.next;

            // set "next" pointer of node to be deleted to null
            current.next = null;
        }
        int size(){
            System.out.println("");
            return size;
        }
        int search(String key){
            int i=0;
            Node temp=head;
            while (temp !=null){
                if(temp.data==key){
                    System.out.println("The key found at index "+i);
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        int help(String key, Node head){
            if(head==null){
               return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=help(key, head.next);
            if(idx==-1){
                return -1;
            }
            return idx+1;


        }
        int recSearch(String key){
            return help(key,head);
        }
        public void   reverse(){
            Node prev=null;
            Node curr=head;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        void nthprev(int n){
            int size=0;
            Node temp=head;
            while (temp!=null){
                temp=temp.next;
                size++;
            }
            if(n==size){
                System.out.println("The head node is only n");
            }
            int i=1;
            Node temps=head;
            int requiredindx=size-n;
            while (i<requiredindx){
                temps=temps.next;
                i++;
            }
            temps.next=temps.next.next;

        }
        Node midpoint(){
            Node slow=head;
            Node fast=head;
            while (fast !=null &&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        boolean checkpalimdrome(){
            if(head==null && head.next==null){
                return true;
            }
            Node mid=midpoint();
            Node prev=null;
            Node curr=mid;
            Node next;
            while (curr!= null){
                next=curr.next;
                prev=curr.next;
                prev=curr;
                curr=next;
            }
            Node right=prev;
            Node left=head;
            while(right!=null){
                if(right.data==left.data){
                    return  true;
                }
                right=right.next;
                left=left.next;
            }
            return false;
        }
        boolean checkcycle(){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
        void breakloop(Node head){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next;

                if (slow == fast) {
                    break;
                }

            }
            if (slow == fast){
                Node ptr=head;
                while (ptr.next!=slow.next){
                    ptr=ptr.next;
                    slow=slow.next;
                }
                slow.next=null;
            }
        }
        void zigzag(){
            Node mid=midpoint();

            Node prev=null;
            mid.next=null;
            Node curr=mid;
            Node next ;
            while (curr !=null && curr.next!=null){
                next=curr.next;
                prev=curr.next;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node Lnext;
            Node Rnext;
            while( left!=null && right!=null){
                Lnext=left.next;
                left.next=right;
                Rnext=right.next;
                right.next=Lnext;

                left=Lnext;
                right=Rnext;
            }
            

        }

    public static void main(String[] args) {
        LL l=new LL();
        l.addfirst("hii");
        l.addlast("hii");
        l.addlast("hii");
        l.addlast("hii");
        l.println();
        l.zigzag();
        l.println();
//        System.out.println(l.checkpalimdrome());


       // l.delemid(1);
//        System.out.println(l.search("you"));
//        System.out.println(l.recSearch("you "));
//        l.println();
//
//        l.addmid(1,"hello");
//        System.out.println(l.size());
//        l.reverse();
//        l.println();


    }
}
