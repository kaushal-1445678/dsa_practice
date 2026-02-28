const isPalindrome=(s,i=0)=>{
    let n=s.length;

    if(i>=Math.floor(n/2)){
        return true;
    }
    
    if(s[i]!=s[n-1-i]){
        return false;
    }
    return isPalindrome(s,i+1);
}
let s="madam";
let ans=isPalindrome(s);
console.log(ans);