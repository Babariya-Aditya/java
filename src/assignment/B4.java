package assignment;

final class AB{

    final int x=6;
    int z;
    final void get(int z){
        this.z=z;
        System.out.println("The value is x and z is "+x+" And "+z);
    }

}
public class B4 {
    public static void main(String[] args) {
        AB a=new AB();
        a.get(3);
    }
}
