from math import *
def isprime(n):
    if n<2 :
        return False
    for i in range(2, isqrt(n)+1):
        if(n%i==0):
            return False
    return True
t = int(input())
for _ in range(t):
    n= int(input())
    k=0
    for i in range(1, n):
        if gcd(i,n)==1:
            k=k+1
    if(isprime(k)):
        print("YES")
    else:
        print("NO")