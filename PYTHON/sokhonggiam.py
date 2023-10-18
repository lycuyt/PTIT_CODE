def check(s):
    # so khong giam
    a= list(int(i) for i in s)
    for i in range(len(a)-1):
        if a[i]>a[i+1]: return False
    return True

t=int(input())
for _ in range(t):
    s= input()
    if check(s): print("YES")
    else : print("NO")
