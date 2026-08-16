def isPalindrome(s,i):
    n=len(s)
    if i>=n//2:
        return True
    if s[i]!=s[n-1-i]:
        return False
    return isPalindrome(s,i+1)

s='madam'
print(isPalindrome(s,0))
