const print1toN = (i,n)=>{
    if(i>n){
        return;
    }
    
    console.log(i);
    print1toN(i+1,n);
}
let n=5;
print1toN(1,5);