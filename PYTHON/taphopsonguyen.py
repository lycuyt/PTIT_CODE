from math import *
n, m= map(int, input().split())
a=list(map(int, input().split()))
b=list(map(int, input().split()))
c=set(a)
d=set(b)
u=c.intersection(d)
v=c.difference(d)
s=d.difference(c)
u=list(u)
v=list(v)
s=list(s)
u.sort()
v.sort()
s.sort()
for x in u:
    print(x, end=' ' )
print()

for x in v:
    print(x, end=' ')
print()

for x in s:
    print(x, end=' ')