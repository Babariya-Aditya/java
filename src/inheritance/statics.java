package inheritance;
 class N {
     private static void msg(int number) {
         System.out.println("number is" + number);

     }

     static class M {
       static   void info(int marks) {
             System.out.println("marks" + marks);
             msg(12);
         }
     }
 }
public class statics {
     public static void main(String[]args){
         N.M.info(45);

     }
}
