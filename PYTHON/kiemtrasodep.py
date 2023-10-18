from math import *
def check( s ):
    a= list(int(i) for i in s)
    b= set(a)
    if len(b)!=2: return False
    chan=a[0]
    le=a[1]
    for i in range(len(a)):
        if i%2==0:
            if a[i]!=chan : return False
        else:
            if(a[i]!=le): return False
    return True



t =int (input())
for _ in range(t):
    s = input()
    if check(s) : print('YES')
    else: print("NO")
