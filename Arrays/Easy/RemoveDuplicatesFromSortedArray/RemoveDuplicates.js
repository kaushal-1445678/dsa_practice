//brute force (using hashset)
//tc:-0(nlogn)+0(n)
//sc:-0(n)


// const removeDuplicates=(a)=>{
//     let hash=new Set();
//     let n=a.length;
//     for(let i=0;i<n;i++){
//         hash.add(a[i]);
//     }
//     let k=hash.size;
//     let j=0;
//     for(let x of hash){
//         a[j]=x;
//         j++;
//     }
//     return k;
// }

//optimal approach
//tc:-0(n)
//sc:-0(1)
const removeDuplicates=(arr)=>{
    let i=0;
    for(let j=1;j<arr.length;j++){
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;
        }
    }
    return i+1;
}
let a=[1,2,4,5,6,7,7,8,8,9,10];
let ans=removeDuplicates(a);
console.log('Unique elements:',ans);
for(let i=0;i<ans;i++){
    process.stdout.write(a[i]+" ");
}