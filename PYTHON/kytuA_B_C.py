# hien thi cac xau co do dai khong qua N
def check(s):
    a=set(s)
    if(len(a)<3) : return False
    cnta, cntb, cntc=0,0,0
    for x in s:
        if x=='A': cnta+=1
        if x=='B': cntb+=1
        if x=='C': cntc+=1
    if cnta<=cntb and cntb<=cntc: return True
    else: return False
def backtrack(k,s,a):
    if len(s)==k:
        if(check(s)):  a.append(s)
        return
    for i in range (3):
        l=chr(65+i)
        backtrack(k, s+l, a)

N= int(input())

for k in range(3,N+1):
    a=[]
    backtrack(k,"",a)
    a.sort()
    for x in a:
        print (x)


