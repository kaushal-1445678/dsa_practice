//parameterised way
// const factorial=(f,n)=>{
//     if(n===0 ||n===1){
//         return f;
//     }
//     return factorial(f*n,n-1);
// }
// let n=5;
// let f=1;
// console.log(factorial(f,n));

//functional way
const factorial =(n)=>{
    if(n===0 || n===1){
        return 1;
    }
    return n*factorial(n-1)
}
let n=5;
console.log(factorial(n));