import java.util.*;
class CheckPalindrome{
public static void main(String[] args){
        int a=121;
        boolean ans=countDigit(a);
        System.out.println(ans);
}
public static boolean countDigit(int a){
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

