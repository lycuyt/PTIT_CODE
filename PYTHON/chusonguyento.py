from math import *
def isprime(n):
    if n <2 : return False
    for i in range(2, isqrt(n)+1):
        if n%i==0: return False
    return True

t =int(input())
for _ in range(t):
    s= input()
    a= list(int(i) for i in s)
    p, np=0,0
    for x in a:
        if isprime(x): p+=1
        else: np+=1
    if(isprime(len(a)) and p>np): print("YES")
    else : print("NO")