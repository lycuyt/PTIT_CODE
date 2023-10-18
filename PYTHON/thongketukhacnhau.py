from math import*
from collections import Counter

d = set()
d.add(' ')
for i in range(48,58): d.add(chr(i))
for i in range(65, 91): d.add(chr(i))
for i in range(97,123): d.add(chr(i))
a=[]
for t in range(int(input())):
    s = input().lower()
    res=''
    for x in s :
        if x in d: res+=x
        elif x not in d: res+=' '
    for x in res.split(): a.append(x)
dd={}
for x in a:
    # print(x, end=' ')
    if x not in dd :
        dd[x] = 1
    else :
        dd[x]+=1
# for k, v in dd.items():
#     print(k, v)
b = list(dd.items())
c= sorted(b,key = lambda x : (-x[1], x[0]))
# couter = list(Counter(a).items())
# couter.sort(key = lambda x : (-x[1], x[0]))
for key, val in c:
    print(key, val)