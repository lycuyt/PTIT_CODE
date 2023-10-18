from math import *
t=int(input())
for _ in range(t):
    n= int(input())
    a= list ( map(int, input().split()))
    d=[1]*n
    for i in range(n):
        for j in range(i):
            if a[j]<a[i]:
                d[i]+=1
    for x in d:
        print(x, end=' ')
        
    print()