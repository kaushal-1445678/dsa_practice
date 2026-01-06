public class print1toNbacktracking {
    public static void main(String[] args) {
        int n=5;
        print1toNbacktracking(5,n);
        
    }
    public static void print1toNbacktracking(int i,int n){
        if(i==0){
            return;
        }
        print1toNbacktracking(i-1, n);
        System.out.println(i);
    }
}
