def Try(s):
    global vs, n
    if len(s)==n:
        print(s)
        return
    for i in range(n):
        if (vs[i]==0):
            vs[i]=1
            Try(s+a[i])
            vs[i]=0

a= input()
n= len(a)
vs=[0]*n
Try("")