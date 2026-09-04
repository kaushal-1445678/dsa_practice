def leftRotate(arr):
    temp=arr[0]
    for i in range(1,len(arr)):
        arr[i-1]=arr[i]

    arr[len(a)-1]=temp


a=[1,2,4,5,6]
leftRotate(a)
print(a)