n =int(input())
a = []
res = ''
for _ in range(n):
    s = input()
    
    for i in range(len(s)):
        if s[i].isalpha(): res= res+' '
        else : res= res+s[i]

a = list (map(int, res.split()))
a.sort()
for i in a:
    print(i)
