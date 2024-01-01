package DSAClassPU;

public class Binary_Search {
    static int binarysearch(int a[], int n, int target){
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
       while (low >= high){
           if(a[mid]==target){
               return mid;
           }
           else if (a[mid]<target) {
               low=mid+1;

           }
           else if (a[mid]>target){
               high=mid-1;
           }

       }
       return mid;
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9,10};
        int n=6;
        System.out.println( binarysearch(arr,n,4));;


    }
}
