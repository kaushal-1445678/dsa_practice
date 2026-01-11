//parameterised way

// const sumOfNNumber=(sum,n)=>{
//     if(n===0){
//         return sum;
//     }
//     return sumOfNNumber(sum+n,n-1);
// }

// let n=5;
// let sum=0
// console.log(sumOfNNumber(sum,n));

//functional way

const sumOfNNumber=(n)=>{
    if(n===0){
        return 0;
    }
    return n+sumOfNNumber(n-1);
}
let n=5;
console.log(sumOfNNumber(n));

