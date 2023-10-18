from math import *
p=[1]*1000001
def sevie():
    p[0]=p[1]=0
    for i in range(2,isqrt(1000000)+1 ):
        if(p[i]):
            for j in range(i*i, 1000001, i): p[j]=0

def slove():
    for i in range(1000001):
        if(p[i]):
            a=str(i)
            b=a[::-1]
            if(a!=b and p[int(b)]): p[i]=1
            else: p[i]=0

sevie()
slove()
t= int(input())
for _ in range(t):
    n= int(input())
    for i in range(n):
        if(p[i]): 
            a=str(i)
            b=a[::-1]
            if(i<n and int(b)<n and i<int(b)): print(i,int(b), end=' ')
    print()


