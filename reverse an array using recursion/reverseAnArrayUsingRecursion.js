// const reverseAnArrayUsingRecursion =(n,i,j)=>{
//     if(i>=j){
//         return;
//     }
//     [n[i],n[j]]=[n[j],n[i]];
//     reverseAnArrayUsingRecursion(n,i+1,j-1);

// };
// const n=[9,8,7,6];
// reverseAnArrayUsingRecursion(n,0,n.length-1);
// console.log(n.join(' '));

const reverseAnArrayUsingRecursion =(n,i)=>{
    if(i>=n.length/2){
        return;
    }
    [n[i],n[n.length-1-i]]=[n[n.length-1-i],n[i]];
    reverseAnArrayUsingRecursion(n,i+1);

};
const n=[9,8,7,6];
reverseAnArrayUsingRecursion(n,0);
console.log(n.join(' '));

