from math import *
def check(a,b):
    cnt=0
    for i in range(len(b)):
        if(a[cnt]==b[i]):
            cnt+=1
    if(cnt==len(a)) :return 1
    else: return 0
t= int(input())
for _ in range(t):
    n=int(input())
    kt=0
    y=int(pow(n,1/3))
    for i in range(y,0,-1):
        z=i**3
        if (check(str(z),str(n))==1):
            print(z)
            kt=1
            break

    if(kt==0):print(-1)
        
        