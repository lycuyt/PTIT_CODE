from collections import Counter
from math import *
def isprime(n):
    if n<2: return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True
n= int( input())
a= list(map(int, input().split()))
d=[0]*(10**6)
for i in range(n):
    d[a[i]]+=1
for i in range(n):
    if d[a[i]]>=1 and isprime(a[i]):
        print(a[i], d[a[i]])
        d[a[i]]=0

