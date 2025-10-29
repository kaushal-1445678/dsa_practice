import java.util.*;
class ArmstrongNumber{
public static void main(String[] args){
        int a=153;
        boolean ans=isArmstrong(a);
       
        System.out.println(ans);
}
public static boolean isArmstrong(int n){
    int cnt=0;
    int temp=n;
    while(temp!=0){
        cnt++;
        temp=temp/10;

    }
    int m=n;
    int rv=0;
    while(m!=0){
        int dig=m%10;
        rv+=Math.pow(dig,cnt);
        m=m/10;
        
    }
    if(rv==n){
        return true;
    }
    return false;

}
}

