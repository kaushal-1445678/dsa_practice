const isArm = (n)=>{
    let temp=n;
    let sum=0;
    let k=String(n).length;
    while(temp!==0){
        let dig=temp%10;
        sum+=Math.pow(dig,k);
        temp=Math.trunc(temp/10);
    }
    if(n===sum){
        return true;
    }
    return false;

}
let n=153;
console.log(isArm(n));