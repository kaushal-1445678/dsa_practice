//brute force
//tc:-0(nlogn)+0(n)
// sc:-0(1)

// const sLargest =(arr)=>{
//     let sLargest=0;
//     arr.sort((a,b)=>a-b);
//     let n=arr.length;
//     let Largest=arr[n-1];
//     for(let i=n-2;i>=0;i--){
//         if(arr[i]!=Largest){
//             sLargest=arr[i];
//             break;
//         }
//     }
//     return sLargest;
// }

//better approach:-
//tc:-0(2n)
// sc:-0(1)

// const sLargest=(arr)=>{
//     let sLargest=0;
//     let largest=0;
//     let n=arr.length;
//     for(let i=0;i<n;i++){
//         if(arr[i]>largest){
//             largest=arr[i];
//         }

//     }
//     for(let i=0;i<n;i++){
//         if(arr[i]>sLargest && arr[i]!=largest){
//             sLargest=arr[i];
//         }
//     }
//     return sLargest;
// }

//optimal solution
//tc:-0(n)
// sc:-0(1)

const sLargest=(arr)=>{
    let n=arr.length;
    let largest=0;
    let sLargest=0;
    for(let i=0;i<n;i++){
        if(arr[i]>largest){
            sLargest=largest;
            largest=arr[i];
        }else if(arr[i]<largest && arr[i]>sLargest){
            sLargest=arr[i];
        }
    }
    return sLargest;
}
let a=[2,4,6,7,10,9];
console.log(sLargest(a));
