from math import *
def check( a, b, c):
    if gcd(a,b)==1 and gcd(b,c)==1 and gcd(c, a)==1:
        return True
    return False
l,r= map(int, input().split())
#chon tap 3 so bat ki trong khoang tu l -> r
for i in range(l, r+1):
    for j in range(i+1, r+1):
        for k in range(j+1, r+1):
            if(check(i,j,k)):
                res="("
                res+=str(i)+", "+str(j)+", "+str(k)
                res+=")"
                print(res)