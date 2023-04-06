package inheritance;

abstract class Hey{
    int roll;
    abstract void info(int roll);

    }

public class abstracts {
    public static void main(String[]args){
        Hey a=new Hey() {
            @Override
            void info(int roll) {
                System.out.println("roll number = "+roll);
            }
        };
        a.info(45);


    }
}
