const bubble =(arr)=>{
    let n=arr.length;
    for(let i=n-1;i>=1;i--){
        let didSwap=0;
        for(let j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                [arr[j],arr[j+1]]=[arr[j+1],arr[j]];
                didSwap=1;
            }
        }
        if(didSwap==0){
            break;
        }
    }
}

let arr=[13, 46, 24, 52, 20, 9];
bubble(arr);
console.log(arr);