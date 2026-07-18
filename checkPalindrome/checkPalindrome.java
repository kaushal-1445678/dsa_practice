package checkPalindrome;
import java.util.*;
class CheckPalindrome{
public static void main(String[] args){
        int a=122;
        boolean ans=checkPalindrome(a);
        System.out.println(ans);
}
public static boolean checkPalindrome(int a){
    int temp=a;
    int rv=0;
    while(temp!=0){
        int dig=temp%10;
        rv=rv*10+dig;
        temp=temp/10;
    }
    if(a==rv){
        return true;
    }
    return false;
}
}

