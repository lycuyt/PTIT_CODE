from math import *

n= int(input())
a= list(map(int, input().split()))
b=[]
for i in range(n):
    res=0
    for j in range(n):
         tmp = abs(a[i]-a[j])
         res+=tmp

    b.append(res)
# print(b)
print(min(b), end=' ')

for i in range(n):
     if b[i]==min(b):
          print(a[i])
          break
