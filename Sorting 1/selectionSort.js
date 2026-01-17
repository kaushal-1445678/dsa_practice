const selection =(arr)=>{
    let n=arr.length;
    for(let i=0;i<=n-2;i++){
        let mini=i;
        for(let j=i;j<=n-1;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        [arr[i],arr[mini]]=[arr[mini],arr[i]];
    }
}
const arr = [64, 25, 12, 22, 11];
selection(arr);
console.log(arr);