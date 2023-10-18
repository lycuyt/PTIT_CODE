from math import *
from functools import cmp_to_key
def cmp(a, b):
    c= list(int(i) for i in str(a))
    d= list(int(i) for i in str(b))
    if sum(c)< sum(d):
        return -1
    elif sum(c)==sum(d) :
        if a<b:
            return -1
        else:
            return 1
    else:
        return 1
t=int(input())
for _ in range(t):
    n= int(input())
    a= list(map(int, input().split()))
    a.sort(key=cmp_to_key(cmp))
    for x in a:
        print(x, end=' ')
    print()
