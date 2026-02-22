const checkPrime =(n)=>{
    if(n<=1){
        return false;
    }
    let sq=Math.sqrt(n);
    let count=0;
    for(let i=1;i<=sq;i++){
        if(n%i==0){
            count++;
            if(n/i !==i){
                count++;
            }
        }


    }
    if(count==2){
        return true;
    }
    return false;


}
let n=14;
console.log(checkPrime(n));