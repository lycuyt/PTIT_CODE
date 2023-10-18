s1=input().lower()
s2=input().lower()
a= set(map(str, s1.split()))
b= set(map(str, s2.split()))
 # hop
u=list(a.union(b))
#giao
v=list(a.intersection(b))
u.sort()
v.sort()
for x in u:
    print(x, end=' ')
print()
for x in v:
    print(x, end=' ')
    
