t= int(input())
for _ in range(t):
    s= input()
    res=[]
    ans=[]
    for x in s:
        if x>='A' and x<='Z':
            res.append(x)
        else:
            ans.append(int(x))
    res.sort()
    for x in res:
        print(x, end='')
    print(sum(ans))
    