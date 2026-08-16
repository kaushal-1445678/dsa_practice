def fibo(i):
    if i<=1:
        return i
    left=fibo(i-1)
    right=fibo(i-2)
    return left+right

n=8
print(fibo(n))