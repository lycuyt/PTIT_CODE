def slove(s):
    k = len(s) - 1
    res = 0
    for i in s:
        res+= 2**k * int(i)
        k-=1
    return res

f = open('DATA.in', 'r')
t = int(f.readline())
# print(t)
for _ in range(t):
    k = int(f.readline())
    a = f.readline().rstrip('\n')
    # print(k, a)

    res = slove(a)

    ans = ""
    while res >0:
        r = res%k
        if r< 10:
            ans+=str(r)
        else:
            if r == 10 : ans+="A"
            if r == 11 : ans+="B"
            if r == 12 : ans+="C"
            if r == 13 : ans+="D"
            if r == 14 : ans+="E"
            if r == 15 : ans+="F"
        res = res //k
    
    print(ans[::-1])


