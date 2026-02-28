const fibo =(n)=>{
    if(n<=1){
        return n;
    }
    let first=fibo(n-1);
    let second=fibo(n-2);
    return first+second;
}
let n=6;
console.log(fibo(n));