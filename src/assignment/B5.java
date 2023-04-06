package assignment;
public class B5
{
    public static void main(String[] args)
    {
        B5 ex = new B5();
        ex = null;
        System.gc();
        System.out.println("Unreferenced object ex is destroyed successfully!");
    }

    @Override
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        System.out.println("Performing clean-up before destroying the object.");
        System.out.println("Release and close connections.");
    }
}