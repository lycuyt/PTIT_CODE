from math import *
p=[1]*10001
def seive():
    p[0]=p[1]=0
    for i in range(2, isqrt(10000)+1):
        if p[i]==1:
            for j in range(i*i, 10000+1, i):
                p[j]=0

n= int(input())
a= list(map(int, input().split()))
seive()
cnt=0
for i in range(len(a)):
    if p[a[i]]==0:
        # print(a[i])
        # tim so nguyen to gan nhat vs no
        k= a[i]
        while(p[k]==0):
            k-=1
        h=a[i]
        while(p[h]==0):
            h+=1
        res=min(abs(k-a[i]), abs(h-a[i]))
        cnt =max(cnt, res)
    # print(cnt)

print(cnt)