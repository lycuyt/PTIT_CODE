t = int(input())
for _ in range(t):
    s= input()
    res=' '
    for x in s:
        if(x.isalpha()): res+=' '
        else: res+=x
    a= map(int , res.split())
    print(max(a))