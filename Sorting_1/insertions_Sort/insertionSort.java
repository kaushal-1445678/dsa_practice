public class insertionSort {
    public static void main(String[] args){
        int[] a={22,54,76,89,01,42};
        insertion(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    
}
