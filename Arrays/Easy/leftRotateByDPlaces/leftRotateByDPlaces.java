package Arrays.Easy.leftRotateByDPlaces;
import java.util.*;
public class leftRotateByDPlaces {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        //               d     n
        leftRotate(a,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    //brute force 
    //tc:-0(d)+0(n-d)+0(d)=0(n+d)
    //sc:-0(d) 
    // public static void leftRotate(int[] arr,int d){
    //     int n=arr.length;
    //     if(n==0){
    //         return;
    //     }
    //     d=d%n;
    //     ArrayList<Integer> temp=new ArrayList<>();
        
    //     for(int i=0;i<d;i++){
    //         temp.add(arr[i]);
    //     }
    
    //     for(int i=d;i<n;i++){
    //         arr[i-d]=arr[i];
            

    //     }
    //     for(int i=n-d;i<n;i++){
    //         arr[i]=temp.get(i-(n-d));

    //     }

    // }


    //optimal approach:-
    //tc:-0(d)+0(n-d)+0(n)=0(2n)
    //sc:-0(1)
    public static void leftRotate(int[] arr,int d){
         int n=arr.length;
        if(n==0){
            return;
        }
       
        d=d%n;
        reverse(arr,0,d-1);//0(d)
        reverse(arr,d,n-1);//0(n-d)
        reverse(arr,0,n-1);//0(n)

    }
     public static void rightRotate(int[] arr,int d){
         int n=arr.length;
        if(n==0){
            return;
        }
       
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);

    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
