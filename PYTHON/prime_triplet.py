from math import *
p=[1]*1000001
def sevie():
    p[0]=p[1]=0
    for i in range(2,isqrt(1000000)+1 ):
        if(p[i]):
            for j in range(i*i, 1000001, i): p[j]=0

sevie()
t=int(input())
for _ in range(t):
    n=int(input())
    cnt=0
    for i in range(2, n):
        if(i+2<n and i+6 <n and p[i] and p[i+2]and p[i+6]) or (i+4<n and i+6 <n and p[i] and p[i+6]and p[i+4]): cnt+=1
    print(cnt)