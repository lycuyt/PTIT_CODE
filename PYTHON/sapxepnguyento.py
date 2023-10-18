from math import *
def isprime(n):
    if n<2 :
        return False
    for i in range(2, isqrt(n)+1):
        if(n%i==0):
            return False
    return True

n= int (input())
a= list(map(int, input().split()))
b=[]
for i in range(n):
    if isprime(a[i]): b.append(a[i])
b.sort()
# print(b)
k=0
for i in range(n):
    if not isprime(a[i]): print(a[i], end=' ')
    else:
        print(b[k], end=' ')
        k+=1
