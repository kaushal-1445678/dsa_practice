// const selection =(arr)=>{
//     let n=arr.length;
//     for(let i=0;i<=n-2;i++){
//         let mini=i;
//         for(let j=i;j<=n-1;j++){
//             if(arr[j]<arr[mini]){
//                 mini=j;
//             }
//         }
//         [arr[i],arr[mini]]=[arr[mini],arr[i]];
//     }
// }
// const arr = [64, 25, 12, 22, 11];
// selection(arr);
// console.log(arr);

const selectionSort=(a)=>{
    let mini=0;
    let n=a.length;
    for(let i=0;i<n-1;i++){
        mini=i;
        for(let j=i;j<n;j++){
            if(a[j]<a[mini]){
                mini=j;
            }
        }
        let temp=a[i];
        a[i]=a[mini];
        a[mini]=temp;
    }
}
n=[1,14,65,86,42,90,87,99,80];
selectionSort(n);
console.log(n.join(' '));