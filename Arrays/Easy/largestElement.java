class LargestELement{
    public static void main(String[] args){
        int[] a={2,4,5,9,8,7,5};
        int ans=largest(a);
        System.out.println(ans);
    }
    public static int largest(int[] arr){
        int n =arr.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}