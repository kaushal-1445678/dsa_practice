// import java.util.*;
// class GCDHCF{
// public static void main(String[] args){
//         int a1=12;
//         int a2=9;
//         int ans=GCDHCF(a1,a2);
      
//         System.out.println(ans);
// }
// public static int GCDHCF(int n1,int n2){
   
//    while(n1>0 && n2>0){
//     if(n1>n2){
//         n1=n1%n2;
//     }else{
//         n2=n2%n1;
//     }
//    }
//    if(n1==0){
//     return n2;
//    }
//    return n1;
// }
// }

import java.util.*;
class GCDHCF{
    public static void main(String[] args) {
        int n1=9;
        int n2=12;
        int ans=gcdHcf(n1, n2);
        System.out.println(ans);
        
    }

    //Approach 1:-
    // public static int gcdHcf(int n1, int n2){
    //     int mini=Math.min(n1,n2);
    //     int ans=0;
    //     for(int i=1;i<=mini;i++){
    //         if(n1%i==0 && n2%i==0){
    //             ans=i;
    //         }
    //     }
    //     return ans;

    // }

    //Approach 2:-
    // public static int gcdHcf(int n1, int n2){
    //     int mini=Math.min(n1,n2);
    //     int ans=0;
    //     for(int i=mini;i>=1;i--){
    //         if(n1%i==0 && n2%i==0){
    //             ans=i;
    //             break;
    //         }
    //     }
    //     return ans;

    // }

    //Approach 3:-

    public static int gcdHcf(int n1,int n2){
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