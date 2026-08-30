def insertion(arr):
    n=len(arr)
    for i in range(0,n):
        j=i
        while(j>0 and arr[j-1]>arr[j]):
            [arr[j-1],arr[j]]=[arr[j],arr[j-1]]
            j-=1

a=[21,54,76,97,8,45,24,66]
insertion(a)
print(a)