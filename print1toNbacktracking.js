const print1toNbacktracking =(i,n)=>{
    if(i==0){
        return;
    }
    print1toNbacktracking(i-1,n);
    console.log(i);
}
let n=5;
print1toNbacktracking(5,n);