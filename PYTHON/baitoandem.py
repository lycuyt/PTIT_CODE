from math import *

n=int(input())
a=[]
while len(a)<n:
    b=list(map(int, input().split()))
    a=a+b
# print(a)
d =[0]*(max(a)+1)
for x in a:
    d[x]+=1
kt =0
for i in range(1, max(a)+1):
    if d[i]==0:
        print(i)
        kt=1
if kt==0:
    print('Excellent!')