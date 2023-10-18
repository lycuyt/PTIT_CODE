t= int(input())
for _ in range(t):
    s= input()
    n= input()
    # so lan xuat hien cua n trong s
    s=s.replace(n,"y")
    cnt=0
    for x in s :
        if x=='y': cnt+=1
    print(cnt)