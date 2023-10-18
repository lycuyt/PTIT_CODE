def dao(n):
    b=str(n)
    c=b[::-1]
    return int(c)
t= int(input())
for _ in range(t):
    n= int(input())
    lan=0
    while 1:
        if(lan>1000):
            print(-1)
            break
        if (n%7==0):
            print(n)
            break
        n=n+dao(n)
        lan+=1
