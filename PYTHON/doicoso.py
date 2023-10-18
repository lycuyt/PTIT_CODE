
from math import *
def quydoi(a):
    # a la so du chay tu 0->35
    if a>=0 and a<=9:
        return chr(a+48)
    if a>=10 and a<=35:
        return chr(a-10+65)

t =int(input())
for _ in range(t):
    n, b= map(int, input().split())
    # chuyen n tu co so 10 sang co so b
    a=[]
    while(n>0):
        r=n%b
        a.append(quydoi(r))
        n=n//b
    a=a[::-1]
    for x in a:
        print(x, end='')
    print()
    