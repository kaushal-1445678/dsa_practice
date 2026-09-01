const quickSort =(arr,low,high)=>{
    if(low<high){
        let pIndex=partition(arr,low,high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);

    }

}
const partition=(arr,low,high)=>{
    let pivot=arr[low];
    let i=low;
    let j=high;
    while(i<j){
        while(arr[low]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j){
            [arr[i],arr[j]]=[arr[j],arr[i]];
        }
    }
    [arr[low],arr[j]]=[arr[j],arr[low]];
    return j;
}
let a =[76,8,9,6,4,2];
quickSort(a,0,a.length-1);
console.log(a.join(" "));