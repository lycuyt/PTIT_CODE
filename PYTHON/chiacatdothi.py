def dfs(u):
    vs[u] = 1
    for v in ke[u]:
        if(vs[v] == 0) : dfs(v)

ke = [[]]
vs = [0] * 101
for _ in range(int(input())):
    n, m = map(int, input().split())
    
    ke = [[] for _ in range(n+1)]

    for i in range(m):
        v, u = map(int, input().split())
        ke[v].append(u)
        ke[u].append(v)

    # for i in range(n+1):
    #     print(ke[i])
    
    cnt = 1
    vt = -1
    for i in range(1, n+1):
        vs = [0]*101
        vs[i] = 1
        tmp =0
        for j in range(1, n+1):
            if(vs[j] == 0):
                dfs(j)
                tmp+=1
        if(cnt < tmp): 
            cnt = tmp
            vt = i
    if(vt == -1): print(0)
    else : print(vt)