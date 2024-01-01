package dsa;
import java.util.ArrayList;
public class StackAL {
    static class Stack{
        ArrayList<Integer> l=new ArrayList<>();
         boolean isempty(){
            if(l.size()==0){
                return true;
            }
            return false;
        }
         void push(int data){
            l.add(data);
        }
        int pop(){
            int top=l.get(l.size()-1);
            l.remove(top);
            return top;
        }
        int peek(){
            if(isempty()){
                System.out.println("stack is empty");

            }
            return l.get(l.size()-1);

        }

    }

    public  static void main(String[] args) {
        Stack s=new Stack();
        System.out.println( s.isempty());
        s.push(45);
        s.push(44);
        s.push(88);
        System.out.println(s.l);
        System.out.println(s.peek());


//        StackAL s=new StackAL();

    }
}
