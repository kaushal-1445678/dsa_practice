//brute force
// const largest=(arr)=>{
//     arr.sort((a,b)=>a-b);
//     return arr[arr.length-1]
// }

//optimal approach:-
const largest=(arr)=>{
    let maxi=arr[0];
    let n=arr.length;
    for(let i=0;i<n;i++){
        if(arr[i]>maxi){
            maxi=arr[i];
        }
    }
    return maxi;
}

a=[2,5,7,9,8,75];

console.log(largest(a));