from math import *
def isprime(n):
    if n <2 : return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True

t =int(input())
for _ in range(t):
    s= input()
    a=s[-4:]
    n= int(a)
    if isprime(n): print("YES")
    else : print("NO")