def quickSort(arr,low,high):
    if(low<high):
        pIndex=partition(arr,low,high)
        quickSort(arr,low,pIndex-1)
        quickSort(arr,pIndex+1,high)

def partition(arr,low,high):
    pivot=arr[low]
    i=low
    j=high
    while i<j:
        while arr[i]<=pivot and i<=high-1:
            i+=1
        while arr[j]>pivot and j>=low+1:
            j-=1
        if i<j:
            arr[i],arr[j]=arr[j],arr[i]
    arr[low],arr[j]=arr[j],arr[low]
    return j

a=[1,24,6,7,8,5]
quickSort(a,0,len(a)-1)
print(a)