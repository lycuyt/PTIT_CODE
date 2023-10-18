t =int(input())
for _ in range(t):
    n = int(input())
    a= list(map(int, input().split()))
    r, l = min(a), max(a)
    d=[0]*(l+2)
    for i in range(n):
        d[a[i]]+=1
    cnt =0
    for i in range(r, l+1):
        if d[i]==0:
            cnt+=1
    print(cnt)
