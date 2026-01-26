const sLargest=(arr) =>{
    let largest=-1;
    let sLargest=-1;
    let n=arr.length;
    for(let i=0;i<n;i++){
        if(arr[i]>largest){
            sLargest=largest;
            largest=arr[i];
        }else if(sLargest<arr[i] && arr[i]!=largest){
            sLargest=arr[i];
        }
    }
    return sLargest;

}
let a=[2,4,6,7,10,9];
console.log(sLargest(a));
