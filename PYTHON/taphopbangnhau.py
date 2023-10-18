from math import *
def check( a, b):
    if len(a)!= len(b): return False
    d= list(a)
    c= list(b)
    for i in range (len(d)):
        if d[i] != c[i]: return False
    return True
 
n, m= map(int, input().split())
c= list(map(int, input().split()))
d= list(map(int, input().split()))
a=set(c)
b=set(d)
if check(a, b):
    print("YES")
else:
    print("NO")
