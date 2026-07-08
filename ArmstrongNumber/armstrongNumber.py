def isArmstrong(n):
    cnt=0
    temp=n;
    while temp!=0:
        cnt=cnt+1
        temp=temp//10

    rv=0
    m=n
    while m!=0:
        dig=m%10
        rv+=dig ** cnt
        m=m//10

    if rv ==n:
        return True
    return False
n=151
print(isArmstrong(n))