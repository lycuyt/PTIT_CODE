from math import *
def check(a):
    for x in a:
        if x!=0: return False
    return True
def checkbalance(a):
    x= a[0]
    for i in range(1, 4):
        if a[i]!=x: return False
    return True
t= True
while t:
    a=list(map(int, input().split()))
    if check(a):
        t= False
        break
    
    cnt=0
    while 1:
        if checkbalance(a):
            break
        b=[0]*4
        for i in range(3):
            b[i]=abs(a[i]-a[i+1])
        b[3]=abs(a[3]-a[0])
        cnt+=1
        a=b
        # print(a)
    print(cnt)