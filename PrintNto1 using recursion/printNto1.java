class PrintNto1{
    public static void main(String[] args) {
        int n=5;
        printNto1(n,n);
        
    }
    public static void printNto1(int i,int n){
        if(i==0){
            return;
        }
        System.out.println(i);
        printNto1(i-1,n);

    }
}