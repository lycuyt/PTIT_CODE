def generate(limit,v,sum, a, s, res):
    if sum==s:
        com="["+" ".join(str(x) for x in v)+"]"
        res.append(com)
    for x in a:
        if x>=limit and sum+x<=s:
            v.append(x)
            
            generate(x,v,sum+x,a,s, res)
            v.pop()
            

t=int(input())
for _ in range(t):
    n, s= map(int, input().split())
    a=list(map(int, input().split()))
    a.sort()
    v=[]
    res=[]
    generate(1,v,0,a,s, res)
    if(len(res)==0) :
        print(-1)
    else:
        for x in res:
            print(x, end='')
    print()
