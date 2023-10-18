from math import*

n = int(input())
a =[]
while(len(a)<n):
    b =list(map(int, input().split()))
    a+=b
chan =[]
le=[]
for x in a:
    if x%2==0:
        chan.append(x)
    else:
        le.append(x)
chan.sort()
le.sort(reverse=True)
# print(*chan)
# print(*le)
k, h=0, 0
for i in range(n):
    if(a[i]%2==0):
        print(chan[k], end=' ')
        k+=1
    else:
        print(le[h], end=' ')
        h+=1
