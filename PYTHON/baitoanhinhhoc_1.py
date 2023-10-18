from math import *
# tinh khoang cach giua hai dem
def distance(a, b):
    # a, b la cac list cos 2 phan tu
    c= sqrt((a[0]-b[0])**2 +(a[1]-b[1])**2)
    return c

t= int(input())
for _ in range(t):
    n=int(input())
    k= int(input())
    a=[]
    for i in range(n):
        b= list(map(int, input().split()))
        a.append(b)
    # print(a)
    d=[]
    # tim duongt tron ngoai tiep 3 dinh
    for i in range(n):
        b=[]
        for j in range(i+1,n):
            # tinh do dai cac doan thang bat ki co the tao dc
            b.append(distance(a[i], a[j]))
        d.append(b)
    print(d)
   
    
# 2
# 4
# 1
# 0 0
# 5 0
# 0 5
# 1 1
# 5
# 2
# 5 5
# 5 -5
# -5 5
# -5 -5
# 0 0

