from math import *

def backtrack(i, n, k, x, a, res):
    
    for j in range(x[i-1]+1, n-k+i+1):
        x[i]=j
        if i==k:
            v=[]
            for l in range(1, k+1):
                v.append(a[x[l]-1])
            v.sort()
            res.append(v)
        else:
            backtrack(i+1, n, k,x, a, res)
        
n, k= map(int, input().split())
a= list(set(map(str, input().split())))
n= len(a)
x=[0]*35
res=[]
backtrack(1, n, k, x, a, res)
res.sort()
for m in res:
    for j in m:
        print(j, end=' ')
    print()