t= int(input())
for _ in range(t):
    n= int(input())
    a= list(map(int, input().split()))
    cnt=0
    a.sort()
    for i in range(n-1):
        l, r= i+1, n-1
        while l<r:
            if a[i]+a[l]+a[r]==0:
                cnt+=1
                l+=1
            elif a[i]+a[l]+a[r]<0:
                l+=1
            else:
                r-=1
    print(cnt)
