
//approach 1:-
// const GCDHCF=(n1,n2)=>{
//     let mini=Math.min(n1,n2);
//     let ans=0;
//     for(let i=0;i<=mini;i++){
//         if(n1%i==0 && n2%i==0){
//             ans=i;
//         }
//     }
//     return ans;
// }


//approach 2:-
// const GCDHCF =(n1,n2)=>{
//     let mini=Math.min(n1,n2);
//     let ans=0;
//     for(let i=mini;i>=1;i--){
//         if(n1%i==0 && n2%i==0){
//             ans=i;
//             break;
//         }
//     }
//     return ans;
// }

//approach 3:- Euclidean Algorithm

const GCDHCF =(n1,n2)=>{
    while(n1>0 && n2>0){
        if(n1>n2){
            n1=n1%n2;
        }else{
            n2=n2%n1;
        }
    
    }
    if(n1==0){
        return n2;
    }
    return n1;
}
let n1=9;
let n2=12;

console.log(GCDHCF(n1,n2));