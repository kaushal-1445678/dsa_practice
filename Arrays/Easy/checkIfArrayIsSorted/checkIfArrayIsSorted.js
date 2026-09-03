const isSorted=(arr)=>{
    for(let i=1;i<arr.length;i++){
       if (arr[i]>=arr[i-1]){
        continue;
       }else{
        return false;
       }
    }
    return true;
}
a=[2,4,6,8,9,12,1];
console.log(isSorted(a));