from math import *
def isFrime(n):
    if n<2: return False
    for i in range(2, isqrt(n)+1):
        if n%i==0 : return False
    return True

t= int(input())
for _ in range(t):
    a, b= map(int, input().split())
    c= gcd(a,b)
    s= sum(int(i) for i in str(c))
    if( isFrime(s)): print("YES")
    else : print("NO")