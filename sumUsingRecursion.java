class sumUsingRecursion{

    
    // public static void main(String[] args) {
    //     int n=5;
    //     int sum=0;
    //     int ans=sumOfNNumber(sum,n);
    //     System.out.println(ans);
        
    // }
    // ////parameterised way
    // public static int sumOfNNumber(int sum,int i){
    //     if(i==0){
    //         return sum;
    //     }
    //     return sumOfNNumber(sum+i, i-1);
    // }




    public static void main(String[] args) {
        int n=5;
        int ans=sumOfNNumber(n);
        System.out.println(ans);
        


    }

    // functional way
    public static int sumOfNNumber(int n){
       
        if(n==0){
            return 0;
        }
        return n+sumOfNNumber(n-1);
    }


}