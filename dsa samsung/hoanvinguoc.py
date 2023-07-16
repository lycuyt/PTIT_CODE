def TRY(n, i, a, vs, v):
    #sinh hoan vi
    for j in range(1,n+1):
        if vs[j]==0:
            a[i]=j
            vs[j]=1
            if i==n:
                res=""
                for l in range(1,n+1):
                    res+=str(a[l])
                v.append(res)   
            else:
                TRY(n,i+1,a,vs, v) 
            vs[j]=0

t = int(input())
for _ in range(t):
    n=int(input())
    a=[0]*(n+5)
    vs=[0]*(n+5)
    v=[]
    TRY(n, 1, a, vs, v)
    v.reverse()
    for ax in v:
        print(ax, end=' ')
    print()