package inheritance;
interface X{
    void msg();
    interface Y{
        void info();
    }


}

public class s {
    public static void main(String [] args)
    {
        X x =new X() {
            @Override
            public void msg() {
                {
                    System.out.println("outer interface");
                }
            }
        };
        x.msg();
        X.Y y=new X.Y() {
                    @Override
                    public void info() {
                        System.out.println("inner interface");
                    }
                };
        y.info();
    }
}
