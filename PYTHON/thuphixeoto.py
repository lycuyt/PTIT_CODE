from math import *
from functools import cmp_to_key
n= int(input())
a=[]
for i in range(n):
    b= list(input().split())
    a.append(b)
# print(a)
s= set()
for x in a: s.add(x[4])
s= sorted(list(s))
d={}
for x in a:
    if x[1]=='Xe_con' and x[2]=='5' and x[3]=='IN':
        if x[4] not in d :
            d[x[4]]=10000
        else: d[x[4]]+=10000
    if x[1]=='Xe_con' and x[2]=='7' and x[3]=='IN':
        if x[4] not in d :
            d[x[4]]=15000
        else: d[x[4]]+=15000
    if x[1]=='Xe_tai' and x[2]=='2' and x[3]=='IN':
        if x[4] not in d :
            d[x[4]]=20000
        else: d[x[4]]+=20000
    if x[1]=='Xe_khach' and x[2]=='29' and x[3]=='IN':
        if x[4] not in d :
            d[x[4]]=50000
        else: d[x[4]]+=50000
    if x[1]=='Xe_khach' and x[2]=='45' and x[3]=='IN':
        if x[4] not in d :
            d[x[4]]=70000
        else: d[x[4]]+=70000

for x in s:
    print(x,": ", d[x],sep='')



