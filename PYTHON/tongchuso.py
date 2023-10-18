s= input()
ss, cnt=0,1
for x in s :
    ss+=(ord(x)-48)
while(ss>9):
    res=0
    for  x in str(ss): res+=(ord(x)-48)
    ss= res
    cnt+=1
print(cnt)