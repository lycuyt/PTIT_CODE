def dfs(u):
    # print(u)
    vs[u] = 1
    for v in ke[u]:
        if(vs[v] == 0) : dfs(v)

vs = [0] * 301
n, m, x = map(int, input().split())
ke = [[] for _ in range(n+1)]

for _ in range(m):
    v, u = map(int, input().split())
    ke[v].append(u)
    ke[u].append(v)

# in ra cac dinh cung thanh phan lien thong vs x
dfs(x)
kt =0
for i in range(1, n+1):
    if(vs[i] == 0): 
        print(i)
        kt = 1
if(kt == 0): print(0)
    