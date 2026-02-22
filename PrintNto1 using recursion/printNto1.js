const printNto1 =(i,n)=>{
    if(i===0){
        return;
    }
    console.log(i);
    printNto1(i-1,n);

}
let n=5;
printNto1(5,5);