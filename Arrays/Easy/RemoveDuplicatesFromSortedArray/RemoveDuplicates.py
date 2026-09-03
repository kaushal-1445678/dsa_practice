# brute force
# def removeDuplicates(a):
#     hash=set()
#     for i in range(0,len(a)):
#         hash.add(a[i])
#     k=len(hash)
#     j=0
#     for x in hash:
#         a[j]=x
#         j+=1
#     return k

#optimal approach:-

def removeDuplicates(a):
    i=0
    for j in range(1,len(a)):
        if a[j]!=a[i]:
            a[i+1]=a[j]
            i+=1

    return i+1





a=[1,1,4,4,5,6,6,7,8,8]
ans=removeDuplicates(a)
for i in range(0,ans):
    print(a[i],end=" ")
print()

print('Unique elements',ans)