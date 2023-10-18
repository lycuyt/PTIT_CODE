from math import*
def back(n, limit, b):
    global a
    if limit ==0:
        combine ="("+" ".join(str(x) for x in b)+")"
        a.append(combine)
    for i in range(n,0, -1):
        if limit>=i:
            b.append(i)
            back(i, limit-i, b)
            b.pop()

t = int(input())
for _ in range(t):
    n= int(input())
    b=[]
    a=[]
    back(n, n, b)
    print(len(a))
    print(*a)