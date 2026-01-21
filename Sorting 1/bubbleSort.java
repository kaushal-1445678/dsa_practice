class BubbleSort{
    public static void main(String[] args) {
          int[] arr = {13, 46, 24, 52, 20, 9};
          bubble(arr);
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          }
        
    }
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            boolean swapped=false;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
                
            
        }
    }
}