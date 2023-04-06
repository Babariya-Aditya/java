package aditya;

abstract class intro{
    abstract void speech();
}
class abstractclass extends intro
{
    void speech()
    {System.out.println("I am Prabhudev");}
    public static void main(String args[]){
        intro obj = new abstractclass();
        obj.speech();
    }
}






