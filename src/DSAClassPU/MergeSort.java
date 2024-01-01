package DSAClassPU;

public class MergeSort {
    public static void print(int array[]){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void Divide(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        Divide(array, si, mid);
        Divide(array, mid + 1, ei);
        Conqure(array, si, ei, mid);
    }
    public static void Conqure(int array[], int si,int ei,int mid){
        int temp[] = new int[ei - si +1];
        int idx1 = si;
        int idx2 = mid+1;
        int k = 0;
        while(idx1 <= mid && idx2 <= ei){
            if(array[idx1] < array[idx2]){
                temp[k] = array[idx1++];
            } else {
                temp[k] = array[idx2++];
            }
            k++;

        }
        while (idx1 <= mid){
            temp[k++] = array[idx1++];
        }
        while (idx2 <= ei){
            temp[k++] = array[idx2++];
        }
        for(k=0 , idx1=si; k<temp.length; k++, idx1++) {
            array[idx1] = temp[k];
        }
    }
    public static void main(String[] args) {
        int array[] = {10,15,20,80,60};
        int si = 0;
        int ei = array.length-1;
        Divide(array,si,ei);
        print(array);
    }
}
;