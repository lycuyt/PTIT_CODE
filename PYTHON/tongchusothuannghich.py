from math import *
def snt(n):
    if n<2: return False
    for i in range(2,isqrt(n)+1):
        if n%i==0:
            return False
    return True
t =int(input())
for _ in range(t):
    a = list(int(x) for x in input())
    b=1
    for x in a:
        if x!=0:
            b*=x
    print(b)