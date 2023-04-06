package inheritance;
interface Hii{
    void msg(int marks);

    interface Hello{
        void info(int number);
    }

}

public class interfaces {
    public static void main(String[] args) {
         Hii n = new Hii() {
            @Override
            public void msg(int marks) {
                System.out.println("marks =" + marks);
            }

        };
         n.msg(45);
         Hii.Hello a= new Hii.Hello() {
             @Override
             public void info(int number) {
                 System.out.println("number = "+number);
             }
         };
         a.info(9965);
    }
}
