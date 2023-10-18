t= int(input())
for _ in range(t):
    n ,k= map(int, input().split())
    ip=input().split()
    if len(ip)==1:
        x1=ip[0]
        x2=input()
    else:
        x1, x2= ip
    # gan cho p nho, q lon
    p=str(min(n,k))
    q=str(max(n, k))
    #tim so lon nhat
    res1= int(x1.replace(q,p))+ int(x2.replace(q,p))
    res2=int(x1.replace(p,q))+int(x2.replace(p,q))
    print(res1, res2)





   