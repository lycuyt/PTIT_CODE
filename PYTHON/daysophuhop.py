from math import *
def check(a,b):
    for i  in range(n):
        if a[i]>b[i]: return False
    return True

t=int(input())
for _ in range(t):
    n= int(input())
    a=list(map(int, input().split()))
    b=list(map(int, input().split()))
    a.sort()
    b.sort()
    if check(a, b):
        print("YES")
    else : 
        print("NO")
    