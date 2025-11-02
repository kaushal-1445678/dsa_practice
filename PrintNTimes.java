public class PrintNTimes{
    public static void main(String[] args){
        printNTimes(5);

    }
    public static void printNTimes(int n){
        if(n==0){
            return;
        }
        System.out.println("kaushal");
        n--;
        printNTimes(n);

    }
}