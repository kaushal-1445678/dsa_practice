
def isPalindrome(n):
    a=n
    rv=0
    while n!=0:
        dig=n%10
        rv=rv*10+dig
        n=n//10
    
    if a==rv:
        return True
    return False

print(isPalindrome(121))

