
public class printNto1backtracking {
    public static void main(String[] args) {
        int n=5;
        printNto1backtraking(1,n);
    }
    public static void printNto1backtraking(int i,int n){
        if(i>n){
            return;
        }
        printNto1backtraking(i+1, n);
        System.out.println(i);
    }
    
}
