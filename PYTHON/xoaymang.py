t =int(input())
for _ in range (t):
    n, d= map(int, input().split())
    a= list(map(int, input().split()))
    #cat d phan tu dau tien cho ra sau
    b= a[:d:1]
    c=a[d::1]
    for x in c:
        print(x, end=' ')
    for x in b:
        print(x, end=' ')
    print()