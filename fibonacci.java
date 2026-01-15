class Fibonacci{
    public static void main(String[] args) {
        int n=5;
        int ans=fibo(n);
        System.out.println(ans);
    }
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        int first=fibo(n-1);
        int second=fibo(n-2);
        return first+second;
    }
}