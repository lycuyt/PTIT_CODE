from math import *

t= True
while(t):
    n= int(input())
    if n==0:
        t=False
        break
    a={'l'}
    for i in range(n):
        a.add(int(input()))
    a.remove('l')
    # print(a)
    b= list(a)
    b.sort()
    # print(b)
    if len(b)==1:
        print("BANG NHAU")
    else:
        print(b[0], b[len(b)-1])
        
    