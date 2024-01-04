from math import *
def isprime(n):
    if n<2 : return False
    for i in range(2,isqrt(n)+1):
        if n % i == 0: return False
    return True

t  = int(input())
for _ in range(t):
    
    a = list(int(i) for i in input())
    # print(a)
    snt, sknt = 0, 0
    for x in a:
        if isprime(x): snt+=1
        else: sknt +=1
    if isprime(len(a)) and snt> sknt:
        print("YES")
    else: print("NO")
