package secondLargest;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        int[] a={2,4,5,9,8,7,5};
        int ans=secondLargest(a);
        System.out.println(ans);

        
    }

    //brute force 
    // tc:-0(nlogn)+0(n)
    // sc:-0(1)

    // public static int secondLargest(int[] arr){
    //     Arrays.sort(arr);
    //     int n=arr.length;
    //     int largest=arr[n-1];
    //     int sLargest=0;
    //     for(int i=n-2;i>=0;i--){
    //         if(arr[i]!=largest){
    //             sLargest=arr[i];
    //             break;
    //         }

    //     }
    //     return sLargest;
    // }

    //better appoarch:-
    //tc:-0(2n)
    // sc:-0(1)

    // public static int secondLargest(int[] arr){
    //     int largest=0;
    //     int sLargest=0;
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>largest){
    //             largest=arr[i];

    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>sLargest && arr[i]!=largest){
    //             sLargest=arr[i];
    //         }
    //     }
    //     return sLargest;
    // }

    //optimal approach:-
   // tc:-0(n)
   // sc:-0(1)

    public static int secondLargest(int[] arr){
        int largest=0;
        int sLargest=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
}
