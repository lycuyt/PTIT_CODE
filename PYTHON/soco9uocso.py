from math import *

# sang so nguyen to den 1600 
p = [1]*16000
dd =[]# luu cac snt tu 2 den 16000
p[0]=p[1]=0
for i in range (2, isqrt(16000)+1):
    if(p[i]==1):
        for j in range ( i*i, 16000, i):
            p[j]=0

for i in range(2, 16000):
    if p[i]==1:
        dd.append(i)

n= int(input())
# tim cac cap (a.b)^2 <n vs a, b la snt
cnt=0
# print(dd)
for i in range ( len(dd)):
    for j in range(i+1, len(dd)):
        if((dd[i]*dd[j])**2<n):
            cnt+=1
        else:
            break

for i in range(n):
    if dd[i]**8<n:
        cnt+=1
    else:
        break
print(cnt)