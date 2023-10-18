from math import *
from collections import Counter
t = int(input())
for _ in range(t):
    n= int(input())
    a= list(map(int, input().split()))
    b= dict(Counter(a))
    for val,fre in b.items():
        if(fre %2==1):
            print(val)
            break