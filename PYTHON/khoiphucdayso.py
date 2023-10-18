from math import *

n= int(input())
c= []
a=[]
for i in range(n):
    b= list(map(int, input().split()))
    a.append(b)

if (n==2): print(1, 1)
else :
    # tim a[0]
    d=a[0][1]+a[0][2]-a[1][2]
    c.append(d//2)
    for i in range(1,n):
        c.append(a[0][i]-c[0])
    print(*c)
