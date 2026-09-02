# brute force 

# def largest(arr):
#     return max(arr)

# def largest(arr):
#     arr.sort()
#     return arr[len(arr)-1]

# def largest(arr):
#     arr.sort()
#     return arr[-1]

#optimal approach
def largest(arr):
    maxi=arr[0]
    for i in range(1,len(arr)):
        if arr[i]>maxi:
            maxi=arr[i]
        
    return maxi

a=[1,54,76,87,99,2]
print(largest(a))