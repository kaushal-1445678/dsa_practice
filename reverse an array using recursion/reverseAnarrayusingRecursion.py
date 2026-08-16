def reverse(a,i):
    n=len(a)
    if i>=n/2:
        return
    [a[i],a[n-1-i]]=[a[n-1-i],a[i]]
    reverse(a,i+1)

a=[1,2,3,4,56]
reverse(a,0)
print(a)
