n, m = map(int, input().split())
a=[]
for i in range(n):
    b= list(map(int, input().split()))
    a.append(b)
if n> m :
    #loai bo hang le, bat dau tu 0 nen coi nhu la loai bo hang chan cho den khi m =n
    k = n
    c=[]
    for i in range(n):
        if k==m : break
        if i%2==0:
            k-=1
            c.append(i)
    # print(c)
    for  i in range(n):
        if i not in c:
            print(*a[i])
elif(n<m):
    k = m
    c=[]
    for i in range(m):
        if k==n : break
        if i%2==1:
            k-=1
            c.append(i)
    for i in range(n):
        for j in range(m):
            if j not in c:
                print(a[i][j], end=' ')
        print()
else:
    for x in a:
        print(*x)    