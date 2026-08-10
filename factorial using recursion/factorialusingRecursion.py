# paramterised way
# def factorial(fac,i):
#     if i==0 or i==1:
#         return fac
#     return factorial(fac*i,i-1)

# n=5
# fac=1
# print(factorial(fac,n))

#functional way
def factorial(n):
    if(n==0 or n==1):
        return 1
    return n*factorial(n-1)

n=5
print(factorial(n))