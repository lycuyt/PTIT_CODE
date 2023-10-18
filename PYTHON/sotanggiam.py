def check( n):
    m= str(n)
    if len(m)<3 : return False
    a= list(int(i) for i in m)
    maxx=max(a)
    vt=0
    for i in range (len(a)):
        if a[i]==maxx:
            vt=i
            break
    for i in range(vt):
        if a[i]>=a[i+1]: return False
    for i in range(vt, len(a)-1):
        if a[i]<=a[i+1]:
            return False
    return True

t= int(input())
for _ in range(t):
    n= int(input())
    if check(n): print("YES")
    else: print('NO')
