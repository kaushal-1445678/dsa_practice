package largestElement;
import java.util.*;
class LargestELement{
    public static void main(String[] args){
        int[] a={2,4,5,9,8,7,5};
        int ans=largest(a);
        System.out.println("largest element is "+ans);
    }

    //brute force 
    // public static int largest(int[] arr){
    //     Arrays.sort(arr);
    //     return arr[arr.length-1];
    // }

    //optimal approach:-
    public static int largest(int[] arr){
        int maxi=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
   
}