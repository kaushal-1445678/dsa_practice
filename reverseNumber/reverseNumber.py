def reverse_number(n):
    rv=0
    while n>0:
        dig=n%10
        rv=rv*10+dig
        n=n//10

    return rv

print(reverse_number(7896))
