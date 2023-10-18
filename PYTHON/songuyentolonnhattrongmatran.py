from math import *
def isprime(n):
    if n<2: return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True
n, m = map(int, input().split())
a=[]
for i in range(n):
    b= list(map(int, input().split()))
    a.append(b)
res=0
for i in range(n):
    for j in range(m):
        if(isprime(a[i][j])):
            res=max(res, a[i][j])
if(res==0):
    print('NOT FOUND')
else:

    print(res)
    for i in range(n):
        for j in range(m):
            if(a[i][j]==res):
                print("Vi tri ",'[',i,']','[',j,']', sep='')