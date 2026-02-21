let n=36;


const getAllDivisor=(n)=>{
    let divisor=[];
    for(let i=1;i*i<=n;i++){
        if(n%i===0){
            divisor.push(i);
            if(i!==n/i){
                divisor.push(n/i);
            }
        }
    }
    return divisor;
}
console.log(getAllDivisor(n).join(" "));
