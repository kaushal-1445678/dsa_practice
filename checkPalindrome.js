let n=2552;
const checkPalindrome =(n) =>{
    let temp=n;
    let rv=0;
    while(temp!==0){
        let dig=temp%10;
        rv=rv*10+dig;
        temp=Math.floor(temp/10);
    }
    if(n===rv){
        return true;
    }
    return false;

}
console.log(checkPalindrome(n));