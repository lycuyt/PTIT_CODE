def slove(n, a):
    import heapq
    heapq.heapify(a)# chuyen doi mang thanh heap
    maxx=0
    while(len(a)>1):
        min1=heapq.heappop(a)
        min2=heapq.heappop(a)
        maxx+=min1+min2
        heapq.heappush(a,min1+min2)
    return maxx

t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    print(slove(n, a))