n= int(input())
a= list(map(float, input().split()))
minn= min(a)
# print(minn)
maxx= max(a)
# print(maxx)
cnt=0
for i in range(n):
    if a[i]==minn: 
        a[i]=0
        cnt+=1
    if a[i]==maxx: 
        a[i]=0
        cnt+=1
# print(a)
s=sum(a)/(n-cnt)
print('%.2f' %s )
