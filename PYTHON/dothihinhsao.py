n= int(input())
ke = [[] for _ in range(n+1)]

for _ in range(n-1):
    v, u = map(int, input().split())
    ke[v].append(u)
    ke[u].append(v)

dem, tmp =0,0
for i in range(1, n+1):
    dem = max(len(ke[i]), dem)
    if(len(ke[i]) == 1): tmp+=1
if(dem == n-1 and tmp == n-1):print("Yes")
else : print("No")
    