n=input()
cnt4, cnt7=0,0
for i in range(len(n)):
    if(n[i]=='4'): cnt4 +=1
    if(n[i]=='7'): cnt7+=1
if(cnt4+cnt7==4 or cnt4+cnt7==7):
    print("YES")
else:
    print("NO")