from math import *

n= int(input())
a=[]
for i in range(n):
    b= list(map(str, input()))
    a.append(b)
# print(a)
cnt=0
# dem theo hang
for i in range(n):
    tmp=0
    for j in range(n):
        if a[i][j]=='C':
            tmp+=1
    cnt+=comb(tmp, 2)

for i in range(n):
    tmp=0
    for j in range(n):
        if a[j][i]=='C':
            tmp+=1
    cnt+=comb(tmp, 2)

print(cnt)
