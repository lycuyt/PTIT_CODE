
t = int(input())

a=[1]*93
for i in range(3,93):
    a[i]=a[i-1]+a[i-2]
for _ in range(t):
    c, b= map(int, input().split())
    for i in range(c, b+1):
        print(a[i], end=' ')
    print()

