def sumOfNNumbers(sum,i):
    if i==0:
        return sum
    return sumOfNNumbers(sum+i,i-1)

n=5
sum=0
print(sumOfNNumbers(sum,n))