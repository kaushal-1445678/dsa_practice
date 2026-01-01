// function countDigit(a){
//     let cnt=0;
//     while(a!==0){
//         cnt++;
//         a=Math.floor(a/10);
//     }
//     return cnt;

// }
// let a=12121212
// let ans=countDigit(a);
// console.log(ans)

const countDigit =(n)=> {
    let cnt=0;
    while(n>0){
        cnt++;
        n=Math.floor(n/10);
    }
    return cnt;

}
let n=1212898945;

console.log(countDigit(n));

