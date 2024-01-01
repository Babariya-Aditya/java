package DSAClassPU;


public class QuickSorty {
   static void  quicksort(int arr[],int low,int high){
        if(low  >= high){
            return;
        }
        int pivot=partion( arr, low, high);
        quicksort(arr, low, pivot-1);
        quicksort(arr,pivot+1,high);
    }
    static int partion(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        i++;
        int temp=arr[i];
        arr[i]= arr[high];
        arr[high]=temp;
        return i;
    }
     static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2,9,8,12};
        quicksort(arr,0,arr.length-1);
        printarray(arr);

    }


}
