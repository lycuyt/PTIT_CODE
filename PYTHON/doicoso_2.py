def tinh(a, k):
    tmp=0
    h=k-1
    for i in range (len(a)):
        if a[i]=='1': tmp=tmp+2**h
        h-=1
    return tmp

t = int(input())
for _ in range(t):
    b= int(input())
    s=input()
    # he 2, 4, 8 , 16 -> 1, 2, 3, 4
    if b==2 : k=1
    elif b==4 : k=2
    elif b==8 : k=3
    else : k=4
    while(len(s)%k != 0):
        s="0"+s
    res=' '
    for i in range(len(s)):
        res+=s[i]
        if (i+1)%k==0: res+=' '
    a= map(str, res.split())
    if(k<4):
        for x in a:
            print(tinh(x, k), end='')
    else:
        for x in a:
            tmp= tinh(x, k)
            if tmp<10: print(tmp, end='')
            else:
                if(tmp==10) : print('A', end='')
                elif(tmp==11): print('B', end='')
                elif(tmp==12) : print('C', end='')
                elif(tmp==13): print('D',end='')
                elif(tmp==14): print('E',end='')
                else : print("F", end='')
    print()
