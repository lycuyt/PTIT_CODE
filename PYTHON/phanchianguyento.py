from math import *
def isprime(n):
    if n<2: return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True
def slove(b, i):
    sum1=0
    for j in range(i+1):
        sum1+=b[j]
    if not isprime(sum1): return False
    sum2=0
    for j in range(i+1, len(b)):
        sum2+=b[j]
    if not isprime(sum2): return False
    return True

n= int(input())
a= list(map(int, input().split()))
d = [0]*1001
for i in range(n):
    d[a[i]]+=1
b=[]
for i in range(n):
    if d[a[i]]>=1:
        b.append(a[i])
        d[a[i]]=0
# print(b)
kt=0
for  i in range (len(b)):
    if slove(b, i):
        print(i)
        kt=1
        break
if kt==0: print("NOT FOUND")
