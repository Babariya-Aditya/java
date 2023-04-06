package practice;

public class b1 {
    public static void main(String[]args){
        int n=5464;
        int reverse=0;
        for(int i = 0; i<n; i++){
            int r=n%10;
            reverse=reverse *10+r;
            n=n/10;

        }
        System.out.println(reverse);
    }
}
