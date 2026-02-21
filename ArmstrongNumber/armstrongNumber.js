// const isArm = (n)=>{
//     let temp=n;
//     let sum=0;
//     let k=String(n).length;
//     while(temp!==0){
//         let dig=temp%10;
//         sum+=Math.pow(dig,k);
//         temp=Math.trunc(temp/10);
//     }
//     if(n===sum){
//         return true;
//     }
//     return false;

// }
// let n=153;
// console.log(isArm(n));


// const isA=(n)=>{
//     let cnt=0;
//     let temp=n;
//     while(temp!=0){
//         cnt++;
//         temp=Math.trunc(temp/10);
//     }
//     let m=n;
//     let ans=0;
//     while(m!=0){
//         let dig=m%10;
//         ans=ans+Math.pow(dig,cnt);
//         m=Math.trunc(m/10);


//     }
//     if(ans==n){
//         return true;
//     }
//     return false;
// }

// let n=153;
// console.log(isA(n));