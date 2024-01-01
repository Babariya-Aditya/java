package DSAClassPU;

public class Candy {
    public static void main(String[] args) {
        int a[]={8,5,3,6,4,3,2};
        int n=7;
        int candy[] = new int[n];
        for (int i=0;i<n;i++){
        candy[i]=1;
    }
        for (int i=0;i<n;i++){
            if(a[i-1]<a[i]){
                candy[i]=candy[i+1];
            }else if(a[i+1]>a[i]){
                candy[i]=candy[i+1];
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(candy[i]);
        }



}}
