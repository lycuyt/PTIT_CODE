t = int (input())
for i in range(1, t+1):
    s1= input()
    s2= input()
    s1= sorted(s1)
    s2= sorted(s2)
    print("Test "+str(i)+": ", end='')
    if s1==s2 : print('YES')
    else : print("NO")
