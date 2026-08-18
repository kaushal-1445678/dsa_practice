def selectionSort(arr):
    n=len(arr)
    mini=0
    for i in range(0,n-1):
        mini=i
        for j in range(i,n):
            if arr[j]<arr[mini]:
                mini=j

        
        temp=arr[i]
        arr[i]=arr[mini]
        arr[mini]=temp

n=[21,54,76,97,8,45,24]
selectionSort(n)
print(n)