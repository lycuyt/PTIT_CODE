t=True
p="ABCDEFGHIJKLMNOPQRSTUVWXYZ_."
while(t):
    a=list(input().split())
    if(int(a[0])==0):
        t=False
        break
    # print(a)
    k=int(a[0])
    s=a[1]
    res=""
    for i in range(len(s)):
        vt=0
        for j in range(len(p)):
            if s[i]==p[j]:
                vt=j
        res+=p[(vt+k)%28]
    b=res[::-1]
    print(b)
       
   

    
