def printAllDivisor(n):
    
    i=1
    while i*i<=n:
        if(n%i==0):
            print(i,end=" ")
            if(i != n//i):
                print(n//i,end=" ")
        i+=1
printAllDivisor(36)