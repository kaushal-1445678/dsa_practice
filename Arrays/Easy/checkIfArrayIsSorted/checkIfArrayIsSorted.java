package checkIfArrayIsSorted;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] a={2,5,7,8,9,1};
        boolean ans=isSorted(a);
        System.out.print(ans);
    }
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        boolean ans=true;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }else{
                ans=false;
                break;
            }

        }
        return ans;
    }
    
}
