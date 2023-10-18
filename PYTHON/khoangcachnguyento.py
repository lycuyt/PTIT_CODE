from math import *
def isprime(n):
    if n<2 : return False
    for i  in range(2,isqrt(n)+1):
        if n%i==0 : return False
    return True

a=[0,2]

k = 3
while (len(a) <= 1001):
    if (isprime(k)):
        a += [k]
    k += 2
n, x = map(int, input().split())
for i in range( n+1):
    x+=a[i]
    # print(a[i])
    print(x, end=' ')
