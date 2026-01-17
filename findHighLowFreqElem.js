
const arr = [10, 5, 10, 15, 10, 5];
const findHighLowFreqElem =(arr)=>{
    let freqmap=new Map();
    let n=arr.length;
    for(const num of arr){
        freqmap.set(num,(freqmap.get(num) || 0)+1);
    }
    let maxF=0;
    let maxE;
    let minF=arr.length;
    let minE;
    for(const[key,value] of freqmap){
        if(value>maxF){
            maxF=value;
            maxE=key;
        }
        if(value<minF){
            minF=value;
            minE=key;
        }
    }
     console.log(`The highest frequency element is: ${maxE}`);
  console.log(`The lowest frequency element is: ${minE}`);
}

findHighLowFreqElem(arr);