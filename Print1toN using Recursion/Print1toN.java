public class Print1toN{
    public static void main(String[] args){
        int n=5;
        print1toN(1,n);

    }
    public static void print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        print1toN(i,n);
    }
}