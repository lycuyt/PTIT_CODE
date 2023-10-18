from math import *
def isprime(n):
    if n <2 : return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True
def check(n):
    a= list ( int(i) for i in n)
    if not isprime(sum(a)): return False
    for i in range (len(a)):
        if i%2==0:
            if a[i]%2==1: return False
        else:
            if a[i]%2==0: return False
    return True
t =int(input())

for _ in range(t):
    n= input()
    if check(n): print("YES")
    else : print("NO")