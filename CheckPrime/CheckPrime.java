import java.util.*;
public class CheckPrime{
    public static void main(String[] args){
        int n=14;
        System.out.println(checkPrime(n));

    }
    public static boolean checkPrime(int n){
        double sq=Math.sqrt(n);
        int count=0;
        for(int i=1;i<=sq;i++){
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}