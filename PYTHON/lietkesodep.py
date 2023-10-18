
def check(a):
    b= str(a)
    l= len(b)
    if l%2==1: return False
    for x in b:
        if x !='0' and x != '2' and x != '4' and x !='6' and x !='8':
            return False
    for i in range(l//2):
        if b[i]!= b[l-i-1]: return False
    return True

t=int(input())
for _ in range(t):
    n= int(input())
    for i in range(n):
        if(check(i)) : print(i, end=' ')
    print()
