const insertion =(arr)=>{
    let n=arr.length;
    for(let i=0;i<=n-1;i++){
        let j=i;
        while(j>0 && arr[j-1]>arr[j]){
            [arr[j-1],arr[j]]=[arr[j],arr[j-1]]
            j--;
        }
    }
}
let a=[21,24,5,6,7,8,67];
insertion(a);
console.log(a.join(" "));