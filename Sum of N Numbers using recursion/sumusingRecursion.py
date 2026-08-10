# parameterised way
# def sumOfNNumbers(sum,i):
#     if i==0:
#         return sum
#     return sumOfNNumbers(sum+i,i-1)

# n=5
# sum=0
# print(sumOfNNumbers(sum,n))

# functional way
def sumOfNNumbers(n):
    if(n==0):
        return 0
    return n+sumOfNNumbers(n-1)

n=5

print(sumOfNNumbers(n))