def check(a):
    for  i in range(len(a)):
        if a[i].isalpha(): return False
    return True

t= int(input())
for _ in range(t):
    a= input().split(".")
    b=[]
    for x in a:
        if check(x): b.append(x)
    ok=True
    if len(b)<4 : ok = False
    else:
        for x in b:
            if int(x)<0 or int(x)>255: ok =False
            if not ok : break
        
    if ok: print("YES")
    else : print("NO")
