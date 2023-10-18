from math import *
n= int(input())
a=[]
for i in range(n):
    b= list(map(int, input().split()))
    a.append(b)
k= int(input())
sum1=0
for i in range (n):
    for j in range(i,n):
        if i!=j:
            sum1+=a[i][j]
sum2=0
for i in range(n):
    for j in range(i+1):
        if i != j:
            sum2+=a[i][j]

if abs(sum1-sum2)<=k: 
    print("YES")
    print(abs(sum1-sum2))
else:
    print("NO")
    print(abs(sum1-sum2))
