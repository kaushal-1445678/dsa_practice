// const leftRotate=(arr,d)=>{
//     let n=arr.length;
//     let temp=[];
//     if(n==0){
//         return;

//     }
//     d=d%n;
//     for(let i=0;i<d;i++){
//         temp.push(arr[i]);
//     }
//     for(let i=d;i<n;i++){
//         arr[i-d]=arr[i];

//     }
//     for(let i=n-d;i<n;i++){
//         arr[i]=temp[i-(n-d)];

//     }

// }
const leftRotate=(arr,d)=>{
    let n=arr.length;
    if(n==0){
        return;
    }
    d=d%n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}
const rightRotate=(arr,d)=>{
    let n=arr.length;
    if(n==0){
        return;
    }
    d=d%n;
    reverse(arr,0,n-1);
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
}
const reverse=(arr,i,j)=>{
    while(i<j){
        let temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}
let a=[1,2,3,4,5,6,7,8,9]
rightRotate(a,2);
console.log(a.join(" "));