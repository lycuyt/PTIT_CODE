from math import *
n , k= map(int, input().split())
# so nguyen to co k chu so , la so nguyen to cug nhau vs n
dau=10**(k-1)
cuoi=10**k
cnt=0
for i in range(dau, cuoi):
    if cnt==10:
        print()
        cnt=0
    if gcd(i,n)==1:
        cnt+=1
        print(i, end=' ')
    