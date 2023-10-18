from math import *
t= int(input())
for _ in range(t):
    n, m = map(int, input().split())

    a= list(map(int, input().split()))
    a=a+[1]
    # print(a)
    maxx= max(a)
    vt=0
    for i in range(n):
        if a[i]==maxx:
            vt=i
            break
    for i in range (n, vt, -1):
        a[i]= a[i-1]
    a[vt]=m
    # print(a)
    for x in a:
        if x<0: print(x, end=' ')
    for x in a:
        if x>=0: print(x, end=' ')
    print()