t= int(input())
for _ in range(t):
    s= input()
    for i in range(0,len(s),2):
        k= ord(s[i+1])-48
        for j in range(k):
            print(s[i],end='')
    print()