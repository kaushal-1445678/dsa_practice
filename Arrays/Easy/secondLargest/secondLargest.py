# brute force 
# tc:-0(nlogn)+o(n)
# sc:-0(1)

# def secondLargest(arr):
#     largest=0
#     sLargest=0
#     arr.sort()
#     n=len(arr)
#     for i in range(n-2,0,-1):
#         if arr[i]!=largest:
#             sLargest=arr[i]
#             break
    
#     return sLargest

# better approach:-
# tc:-0(2n)
# sc:-0(1)
# def secondLargest(arr):
#     largest=0
#     sLargest=0
#     n=len(arr)
#     for i in range(0,n):
#         if arr[i]>largest:
#             largest=arr[i]
        
#     for i in range(0,n):
#         if arr[i]>sLargest and arr[i]!=largest:
#             sLargest=arr[i]

#     return sLargest

#optimal approach
# tc:-0(n)
# sc:-0(1)
def secondLargest(arr):
    n=len(arr)
    sLargest=0
    largest=0
    for i in range(0,n):
        if arr[i]>largest:
            sLargest=largest
            largest=arr[i]
        elif arr[i]<largest and arr[i]>sLargest:
            sLargest=arr[i]
    return sLargest



a=[45,67,89,1,21,42]
print(secondLargest(a))
