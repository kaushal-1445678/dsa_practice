package reverseNumber;
import java.util.*;
class ReverseNumber{
public static void main(String[] args){
        int a=12;
        int ans=reverseNumber(a);
        
        System.out.println(ans);
}
public static int reverseNumber(int n){
    int rv=0;
    while(n!=0){
        int dig=n%10;
        rv=rv*10+dig;
        n=n/10;
    }
    return rv;
}
}

