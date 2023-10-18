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
maxx , minn = a[0][0], a[0][0]
for i in range(n):
    for j in range(m):
        maxx = max(maxx, a[i][j])
        minn= min(minn, a[i][j])
# print(maxx, minn)
res = maxx-minn
kt =0
for i in range(n):
    for j in range(m):
        if(a[i][j]==res):
            kt =1
if(kt==0):
    print("NOT FOUND")
else:

    print(res)
    for i in range(n):
        for j in range(m):
            if(a[i][j]==res):
                print("Vi tri ",'[',i,']','[',j,']', sep='')