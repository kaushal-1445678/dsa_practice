const PrintNTimes=(n) =>{
    if(n==0){
        return;
    }
    console.log("kaushal Tyagi");
    n--;
    PrintNTimes(n);
}
let n=5;
PrintNTimes(n);