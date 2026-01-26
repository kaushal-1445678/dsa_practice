import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        int[] a={2,4,5,9,8,7,5};
        int ans=secondLargest(a);
        System.out.println(ans);

        
    }
    public static int secondLargest(int[] arr){
        int sLargest=-1;
        int Largest=-1;

        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>Largest){
                sLargest=Largest;
                Largest=arr[i];
            }else if(sLargest<arr[i] && arr[i]!=Largest){
                sLargest=arr[i];
            }
        }
        return sLargest;

    }
}
