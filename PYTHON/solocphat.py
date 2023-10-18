t =int(input())
for _ in range(t):
    n= input()
    l= len(n)
    if(n[l-2]=='8' and n[l-1]=='6'):
        print("YES")
    else:
        print("NO")