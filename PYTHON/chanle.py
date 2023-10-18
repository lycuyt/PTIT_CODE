from math import *
def check(a):
    if sum(a)%10 !=0 :
        print("NO")
        return
    for i in range(len(a)-1):
        if abs(a[i]-a[i+1])!=2:
            print("NO")
            return
    print("YES")
t =int(input())
for _ in range(t):
    s= input()
    a=list(int(i) for i in s)
    # print(a)
    check(a)


