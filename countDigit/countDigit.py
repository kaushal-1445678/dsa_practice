
def count_digit(n):
    cnt=0
    while n!=0:
        cnt+=1
        n=n//10;
    return cnt
print(count_digit(78780908965))

