def sinhtohop( i, b):
    global n, k
    if len(b)==k:
        print(*b)
        return
    for j in range(i,n):
        sinhtohop( j+1,b+[a[j]])

# statr
n, k= map(int, input().split())
a= sorted(list({int(i) for i in input().split()}))
n= len(a)
sinhtohop(0,[])