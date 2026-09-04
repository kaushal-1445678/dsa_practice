# def leftRotate(arr,d):
#     n=len(a)
#     if n==0:
#         return
#     d=d%n
#     temp=[]
#     for i in range(0,d):
#         temp.append(arr[i])
    
#     for i in range(d,n):
#         arr[i-d]=arr[i]

#     for i in range(n-d,n):
#         arr[i]=temp[i-(n-d)]
    

def leftRotate(arr,d):
    n=len(a)
    if n==0:
        return
    d=d%n
    reverse(arr,0,d-1)
    reverse(arr,d,n-1)
    reverse(arr,0,n-1)

def rightRotate(arr,d):
    n=len(a)
    if n==0:
        return
    d=d%n
    reverse(arr,0,n-1)
    reverse(arr,0,d-1)
    reverse(arr,d,n-1)

def reverse(arr,i,j):
    while i<j:
        temp=arr[i]
        arr[i]=arr[j]
        arr[j]=temp
        i+=1
        j-=1    
a=[1,2,3,4,5,6,7,8,9]
rightRotate(a,2)
print(a)
