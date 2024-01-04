for _ in range(int(input())):
    n, p = map(int, input().split())
    # tim tu p , den n nhung so chia het cho n
    cnt = 0
    for i in range(p, n+1):
        if i% p == 0:
            # xem i phan tich dc thanh may so co n
            while (i>=p and i%p == 0):
                i = i//p
                cnt+=1
    print(cnt)
