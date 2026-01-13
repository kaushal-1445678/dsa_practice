class ReverseAnArrayUsingRecursion{
public static void main(String[] args){
    int[] n={9,8,7,6};

    reverse(n,0,n.length-1);
    for(int i=0;i<n.length;i++){
        System.out.print(n[i]+" ");
    }
}
public static void reverse(int[] a,int i,int j){
if(i>=j){
    return;
}
int temp=a[i];
a[i]=a[j];
a[j]=temp;
reverse(a,i+1,j-1);
}
}