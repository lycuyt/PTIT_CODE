from math import *
def check(b):
    for i in range(1,len(b)):
        if b[i]!=b[0]: return False
    return True

def biendoi( a, b):
    # so buoc de bien doi b thanh a
    cnt=0
    while(b!=a):
        c= list(str(i) for i in b)
        c.append(c[0])
        c.remove(c[0])
        b= ""
        for i in range(len(c)):
            b+=c[i]
        cnt+=1
    return cnt

n= int(input())
a=[]
for i in range(n):
    a.append(input())
# print(a)
b=[]
for i in range(n):
    b.append(''.join(sorted(a[i])))
# print(b)
s1="xzzwo"
s2="zwoxz"
# print(biendoi(s1, s2))
if(not check(b)): print("-1")
else:
    res=[]
    for i in range(n):
        cnt=0
        for j in range(n):
            # print(biendoi(a[i], a[j]))
            cnt+=biendoi(a[i], a[j])
        res.append(cnt)
    print(min(res))
    
        