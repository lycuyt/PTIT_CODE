s= input()
while len(s) %3 !=0:
    s="0"+s
# print(s)
for i in range(0,len(s),3):
    tmp=0
    k=2
    for j in range(i,i+3,1):
        tmp+=int(s[j])*(2**k)
        k-=1
    print(tmp, end='') 