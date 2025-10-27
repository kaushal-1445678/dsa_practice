import java.util.*;
class TwoSum{
public static void main(String[] args) {
    int[] a={2,4,5,6,7};
    int target=8;
    boolean ans=twoSum(a,target);
    System.out.println(ans);
    
}
public static boolean twoSum(int[] a,int target){
    Arrays.sort(a);
    int n=a.length;
    int left=0;
    int right=n-1;
    while(left<right){
        int sum=a[left]+a[right];
        
            if(sum==target){
                return true;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        
    }
    return false;

}
}
