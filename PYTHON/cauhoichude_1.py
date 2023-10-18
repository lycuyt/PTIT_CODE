n= int(input())
a=[]
for i in range(n):
    a.append(input())
tmp=[]
res=[]
for i in range(n):
    if len(a[i].split()): tmp.append(a[i])
    else:
        res.append(tmp)
        tmp=[]

if len(tmp)>0: res.append(tmp)
for x in res: print(x[0], len(x)-1, sep=': ')