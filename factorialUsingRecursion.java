public class factorialUsingRecursion {
    //paramterised way
    // public static void main(String[] args) {
    //     int n=5;
    //     int f=1;
    //     int ans=factorial(f,n);
    //     System.out.println(ans);
    // }
    // public static int factorial(int f,int n){
    //     if(n==0 || n==1){
    //         return f;
    //     }
    //     return factorial(f*n, n-1);
    // }


    //functional way
    public static void main(String[] args) {
        int n=5;
        int ans=factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}
