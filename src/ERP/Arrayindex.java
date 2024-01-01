package ERP;

public class Arrayindex {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int target=7;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("1st: "+ i+ " 2nd: "+ j);
                   // System.out.println("1st: "+ j+ " 2nd: "+ i);

                }
            }
        }

    }
}
