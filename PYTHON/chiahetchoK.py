a, K, N = map(int, input().split())
#tim cac so b : a+b<=N and a+b %K
check=0
h=K-a%K
for i in range(h,N+1,K):
    if a+i<=N and (a+i)%K==0: 
        print(i, end=' ')
        check=1
if(check==0) :print(-1)
