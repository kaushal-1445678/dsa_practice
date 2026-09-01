package Sorting_2.quickSort;

public class quickSort {
    public static void main(String[] args) {
        int[] a = { 87, 90, 12, 45, 76 };
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        ;

    }

    public static void quickSort(int[] arr, int low, int high) {
        
        if(low<high){
            int pIndex=partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }

    }
    public static int partition(int[] arr, int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
             while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
       

    }

}
