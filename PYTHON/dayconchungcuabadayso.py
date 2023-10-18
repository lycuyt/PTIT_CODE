from math import *
t= int(input())
for _ in range(t):
    n, m, k= map(int, input().split())
    a=list(map(int, input().split()))
    b=list(map(int, input().split()))
    c=list(map(int, input().split()))
    x=0
    y=0
    d=[]
    while (x<n and y<m):
        if(a[x]< b[y]):
            x+=1
        elif a[x]==b[y]:
            d.append(a[x])
            x+=1
            y+=1
        else:
            y+=1
    x,y=0,0
    kt=0
    while x<len(d) and y<k:
        if d[x]<c[y]:
            x+=1
        elif d[x] == c[y]:
            kt=1
            print(d[x], end=' ')
            x+=1
            y+=1
        else:
            y+=1
    if kt==0:
        print("NO", end='')
    print()

