t=int(input())
for _ in range(t):
    n=int(input())
    dp=[0]*(n+1)
    dp[0]=dp[1]=1
    for i in range (2, n+1):
        for j in range(1, min(3,i)+1):
            dp[i]+=dp[i-j]

    print(dp[n])