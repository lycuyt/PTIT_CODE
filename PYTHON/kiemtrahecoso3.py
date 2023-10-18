def check(s):
    for x in s:
        if x != '0' and x !='1' and x!='2': return False
    return True
t= int(input())
for _ in range(t):
    s= input()
    if check(s) : print("YES")
    else : print("NO")