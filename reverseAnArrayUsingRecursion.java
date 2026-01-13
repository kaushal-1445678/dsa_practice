class ReverseAnArrayUsingRecursion{
public static void main(String[] args){
    int[] n={9,8,7,6};

    reverse(n,0);
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]+" ");
    }
}
public static void reverse(int[] a,int i){
    int n=a.length;
if(i>=n/2){
    return;
}
int temp=a[i];
a[i]=a[n-1-i];
a[n-1-i]=temp;
reverse(a,i+1);
}
}