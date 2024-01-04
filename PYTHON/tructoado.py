t = int(input())
for _ in range(t):
    n = int(input())
    arr = []
    for i in range(n):
        a = list(map(int, input().split()))
        arr.append(a)
    arr.sort(key = lambda x : x[1])
    # print(arr)
    cnt, last = 0,0
    for i in range(n):
        a = arr[i]
        if a[0] < last : continue
        last = a[1]
        cnt += 1
    print(cnt)
