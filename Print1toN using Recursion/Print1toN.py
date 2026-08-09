def print1toN(i,n):
    if i>n:
        return
    print('Number is',i)
    i+=1
    print1toN(i,n)

i=1
n=5
print1toN(i,n)