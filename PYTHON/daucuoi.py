t= int(input())
for _ in range(t):
    n= input()
    l= len(n)
    if(n[0]==n[l-2] and n[1]==n[l-1]): print("YES")
    else: print("NO")