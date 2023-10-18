def check(s):
    for x in s:
        if x != '4' and x != '7':
            return False
    return True
t=int(input())
for _ in range(t):
    s=input()
    if(check(s)) : print("YES")
    else: print("NO")