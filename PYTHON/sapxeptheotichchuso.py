from math import *
from functools import cmp_to_key
def tich(a):
    res=1
    while a!=0:
        res*=a%10
        a=a//10
    return res
def cmp(a, b):
    tich1, tich2= tich(a), tich(b)
    if tich1 != tich2:
        return tich1-tich2
    else:
        return a-b
t=int(input())
for _ in range(t):
    n= int(input())
    a= list(map(int, input().split()))
    a.sort(key=cmp_to_key(cmp))
    for x in a:
        print(x, end=' ')
    print()
