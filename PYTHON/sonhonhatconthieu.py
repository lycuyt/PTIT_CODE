d=[0]*30005
n= int(input())
a= list(map(int, input().split()))
for i in range(n):
    d[a[i]]=1
for i in range(1, 30001):
    if d[i]==0:
        print(i)
        break