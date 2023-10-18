t= int(input())
for _ in range(t):
    d=[0]*1001
    n= int(input())
    for i in range(n):
        x= int(input())
        d[x]+=1
    res= max(d)
    a=[]
    for i in range(1, 1001):
        if d[i]==res:
            a.append(i)
    print(min(a))


