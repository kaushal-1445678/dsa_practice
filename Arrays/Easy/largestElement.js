const largest=(arr)=>{
    let n=arr.length;
    let maxi=0
    for(let i=0;i<n;i++){
        if(arr[i]>maxi){
            maxi=arr[i];
        }
    }
    return maxi;
}
a=[2,5,7,9,8,75];

console.log(largest(a));