package Bubble_Sort;

public class bubblesort {
     public static void main(String[] args) {
          int[] arr = {13, 46, 24, 52, 20, 9,8};
          bubble(arr);
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          }
        
    }
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
}
