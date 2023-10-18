def check(a):
    m= len(a)
    if(a[0]==a[m-1]) : print("YES")
    else : print("NO")

t=int(input())
for _ in range(t):
    a= input()
    check(a)