from math import *

t = int(input())
for _ in range(t):
    n= int(input())
    a = list (map(int, input().split()))
    d=[0]*(10**6)
    for i in range(n):
        d[a[i]]+=1

    res= max(d)
    if res<=n//2:
        print("NO")
    else:
        for i in range(n):
            if d[a[i]]==res:
                print(a[i])
                break
