def isSorted(arr):
    for i in range(1,len(a)):
        if arr[i]>=arr[i-1]:
            continue
        else:
            return False
    return True

a=[12,4,6,8,9]
print(isSorted(a))