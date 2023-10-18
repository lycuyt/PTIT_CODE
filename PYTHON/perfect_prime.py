from math import *

def prime(n):
    if(n<2) : return False
    for i in range(2, isqrt(n)+1):
        if(n%i==0) : return False
    return True

def check(n):
    m=n
    sum=0
    dao=0
    while m!=0:
        r=m%10
        dao = dao*10 + r
        if r!=2 and r !=3 and r!=5 and r != 7: return False
        sum+=r
        m=m//10
    if not prime(sum) : return False
    if not prime(dao): return False
    if not prime(n): return False
    return True

t= int(input())
for _ in range(t):
    n= int(input())
    if(check(n)): print("Yes")
    else : print("No")
        
    

