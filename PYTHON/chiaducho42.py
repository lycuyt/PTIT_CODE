from math import *
tc= 10
a=[]
while tc!=0:
    n= input().split()
    for x in n:
        a.append(int(x))
    tc-=len(n)
print(len(set(list(map(lambda x : x%42, a)))))