from math import *
t= int(input())
for _ in range(t):
    n=int(input())
    a=str(n)
    a=a[::-1]
    b= int(a)
    if gcd(n,b)==1:
        print("YES")
    else : 
        print("NO")