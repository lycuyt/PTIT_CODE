def Tryy(n,limit,a):
    if limit==0:
        combine="("+" ".join(str(x) for x in a)+")"
        print(combine,end=" ")
    for i in range(n,0,-1):
        if limit>=i:
            a.append(i)
            Tryy(i, limit-i, a)
            a.pop()
        
t=int(input())
for _ in range(t):
    n=int(input())
    a=[]
    Tryy(n,n,a)
    print()
