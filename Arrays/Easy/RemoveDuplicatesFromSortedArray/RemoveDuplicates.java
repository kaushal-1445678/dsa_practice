package RemoveDuplicatesFromSortedArray;
import java.util.*;
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = { 1, 1, 2, 3, 5, 6, 6 };

        int ans = removeDuplicate(a);

        for (int i = 0; i < ans; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Unique elements is: " + ans);
    }
//brute force 
//tc:-0(nlogn) (n for loop and logn for add in hashset)+0(n)(for loop)
//sc:-0(n)


// public static int removeDuplicate(int[] arr) {
//     HashSet<Integer> hash=new HashSet<>();
//     for(int i=0;i<arr.length;i++){
//         hash.add(arr[i]);
//     }
//     int k=hash.size();
//     int j=0;
//     for(int x:hash){
//         arr[j++]=x;
//     }
//     return k;
// }


//optimal approach:-
//tc:-0(n)
//sc:-0(1)

    public static int removeDuplicate(int[] arr) {

        int n = arr.length;
        int i = 0;

        for (int j = 1; j < n; j++) {

            if (arr[j] != arr[i]) {
                
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }
}