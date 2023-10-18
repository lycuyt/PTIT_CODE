from math import *
n, k= map(int, input().split())
a = list(map(int, input().split()))
a.sort()
# print(a)
cnt=0
idx=0
for i in range(n-1):
    
    if(abs(a[i]-a[i+1])<=k):
        idx+=1
    else:
        cnt +=1

print(cnt+1)
         