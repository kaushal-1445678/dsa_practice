def printNto1(i,n):
    if i<1:
        return
    print('Number is',i)
    i-=1
    printNto1(i,n)

i=5
n=5
printNto1(i,n)