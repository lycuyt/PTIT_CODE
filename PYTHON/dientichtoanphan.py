for tc in range(int(input())):
    m, n=map(int, input().split())
    x=[]
    for i in range(m):
        b=list(map(int, input().split()))
        x.append(b)
    cnt=0
    w=0
    for i in range(0, m):
        for j in range(0, n):
            if x[i][j]>=2:
                cnt-=2*(x[i][j]-1)
            w+=x[i][j]
    for i in range(0, m-1):
        for j in range(0, n-1):
            cnt-=2*min(x[i][j], x[i+1][j])
            cnt-=2*min(x[i][j], x[i][j+1])
    for i in range(0, m-1):
        cnt-=2*min(x[i][n-1], x[i+1][n-1])
    for j in range(0, n-1):
        cnt-=2*min(x[m-1][j], x[m-1][j+1])
    print(w*6+cnt)
"""
5
1 1
1
1 2
1 2
1 1
2
3 3
1 1 1
1 1 1
1 1 1
3 3
1 1 1
1 2 0
1 0 2
"""