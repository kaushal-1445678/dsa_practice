import java.util.*;
class main{
public static void main(String[] args){
        int a=129898765;
        int ans=countDigit(a);
        System.out.println(ans);
}
public static int countDigit(int a){
    int n=a;
    int count=0;
    while(n!=0){
       
        count++;
        n=n/10;
    }
    return count;
}
}

