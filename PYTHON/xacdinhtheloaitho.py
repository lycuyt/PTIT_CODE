from math import *

n = int(input())
a=[]
for _ in range(n):
    s =list(input().split())
    a.append(s)
# print(a)\
cnt=[]
i=0
while i<n:
    if i<n and len(a[i])==6 :
        while i<n and (len(a[i])==6 ):
            i+=2
        # print(2)
        cnt.append(1)
    if i<n and len(a[i])==7:
        i+=4
        # print(1)
        cnt.append(2)
print(len(cnt))
for x in cnt:
    print (x)
       
        
       
    