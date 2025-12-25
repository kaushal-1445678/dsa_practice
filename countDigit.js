function countDigit(a){
    let cnt=0;
    while(a!==0){
        cnt++;
        a=Math.floor(a/10);
    }
    return cnt;

}
let a=12121212
let ans=countDigit(a);
console.log(ans)
