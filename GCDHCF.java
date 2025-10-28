import java.util.*;
class GCDHCF{
public static void main(String[] args){
        int a1=12;
        int a2=9;
        int ans=GCDHCF(a1,a2);
      
        System.out.println(ans);
}
public static int GCDHCF(int n1,int n2){
   
   while(n1>0 && n2>0){
    if(n1>n2){
        n1=n1%n2;
    }else{
        n2=n2%n1;
    }
   }
   if(n1==0){
    return n2;
   }
   return n1;
}
}

