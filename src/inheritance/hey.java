package inheritance;

class Outer {
    private int roll=40;
    //private can be accessed by the inner class in main class

    String name;
    void info(String name){

        System.out.println("name  =  "+name);
    }
    class Inner{
        int marks;
        void fun(int marks,String name){
            System.out.println("Marks  == "+marks+"\n Name = "+name+ "\n Roll =" +roll);
        }
    }
}
public class hey {
    public static void main(String []args){
        Outer a=new Outer();
        Outer.Inner b=a.new Inner();
        b.fun(15,"adi");
        a.info("adi");

    }
}
