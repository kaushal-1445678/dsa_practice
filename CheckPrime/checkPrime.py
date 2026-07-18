import math
def checkPrime(n):
    
    cnt=0
    
    sq=math.sqrt(n)
    for i in range(1,int(sq)+1):
        if n%i==0:
            cnt+=1
            if n//i != i:
                cnt+=1
        
    if cnt==2:
        return True
    return False
    
n=14
print(checkPrime(n))