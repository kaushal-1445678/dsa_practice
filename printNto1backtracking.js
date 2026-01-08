const printNto1backtracking =(i,n)=>{
    if(i>n){
        return;
    }
    printNto1backtracking(i+1,n);
    console.log(i);
}
let n=5;
printNto1backtracking(1,n);