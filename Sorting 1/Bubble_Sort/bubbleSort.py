def bubble(arr):
    n=len(arr)
    for i in range(n-1,0,-1):
        didSwap=0
        for j in range(0,i):
            if arr[j]>arr[j+1]:
                [arr[j],arr[j+1]]=[arr[j+1],arr[j]]
                didSwap=1
        
        if didSwap==0:
            break

arr=[14, 46, 24, 52, 20, 9]
bubble(arr)
print(arr)