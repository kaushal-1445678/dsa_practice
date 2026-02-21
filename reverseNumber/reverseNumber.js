
// let a=12;
// let ans=reverseNumber(a);

// console.log(ans);
// function reverseNumber(a){
//     let temp=a;
//     let rv=0;
//     while(a!==0){
//         let dig=a%10;
//         rv=rv*10+dig;
//         a=Math.floor(a/10);
        
//     }
//     return rv;

// }
const reverseNumber=(n)=>{
    let rv=0;
     while(n!==0){
        let dig=n%10;
        rv=rv*10+dig;
        n=Math.floor(n/10);

     }
     return rv;

}
console.log(reverseNumber(1234));