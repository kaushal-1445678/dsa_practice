package Selection_Sort;
//select minimum and then swap it
class Selection{
    // public static void main(String[] args) {
    //     int[] arr = {13, 46, 24, 52, 20, 9};
    //     selectionSort(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void selectionSort(int[] arr){
    //     int n=arr.length;
    //     for(int i=0;i<=n-2;i++){
    //         int mini=i;
    //         for(int j=i;j<=n-1;j++){
    //             if(arr[j]<arr[mini]){
    //                 mini=j;
    //             }
    //         }
    //         int temp=arr[i];
    //         arr[i]=arr[mini];
    //         arr[mini]=temp;
    //     }
    // }
    public static void main(String[] args) {
        int[] a={1,21,4,12,5,80,61,84,65};
        selectionSort(a);
        for(int i=0;i<a.length;i++){
            
            System.out.print(a[i]+" ");
        }
    }
    public static void selectionSort(int[] a){
        int n=a.length;
        int mini=0;
        for(int i=0;i<n-1;i++){
            mini=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[mini]){
                    mini=j;
                }
            }
            int temp=a[i];
            a[i]=a[mini];
            a[mini]=temp;
        }
    }
}
