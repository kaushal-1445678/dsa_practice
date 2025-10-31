import java.util.*;
class PrintAllDivisor{
    public static void main(String[] args) {
        int a=36;
        printalldivisor(a);
        
    }
    public static void printalldivisor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i !=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
}