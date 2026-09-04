package leftRotateByOnePlace;

public class leftRotateByOnePlace {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        leftRotate(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void leftRotate(int[] a){
        int n=a.length;
        int temp=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];

        }
        a[n-1]=temp;
    }
    
}
