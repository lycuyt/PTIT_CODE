from math import *
from collections import Counter
def check(a):
    for i in range(2, len(a)):
        if a[i]!=a[1]: return False
    return True
n, m= map(int, input().split())
a= list(map(int, input().split()))
d={}
for x in a:
    if x not in d: d[x]=1
    else: d[x]+=1
# print(list(d.items()))
max1, max2, check, ans = 0,0,0,0
for x in d.keys(): max1 = max(max1, d[x])

for key, val in d.items():
    if val > max2 and val<max1:
        max2 = val
        ans = key
        check =1
if check ==0: print("NONE")
else : print (ans)


