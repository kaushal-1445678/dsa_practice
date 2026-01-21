const bubble=(arr)=>{
    let n=arr.length;
    for(let i=n-1;i>=1;i++){
        let swapped=false; 
        for(let j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                [arr[j],arr[j+1]]=[arr[j+1],arr[j]];
                swapped=true;
            }
        }
        if(!swapped){
            break;
        }
    }
}
let arr=[13, 46, 24, 52, 20, 9];
bubble(arr);
console.log(arr);