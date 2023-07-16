t=int(input())
for _ in range(t):
    P,Q= map(int, input().split())
    # doi P/Q thanh Q/P
    # P la tu, Q la mau
    while 1:
        if Q%P==0:
            print("1/",Q//P, sep='', end='')
            break
        x=Q//P + 1
        print("1/",x," + ", sep='', end='')
        P=x*P-Q
        Q=Q*x
    print()