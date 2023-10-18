from math import *
s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
def xoay(b, c):
    sum1, sum2 =0, 0
    for i in range(len(b)):
        sum1+=ord(b[i])-65
        sum2+=ord(c[i])-65
    
    # print(sum1, sum2)
    res1=""
    res2=""
    for i in range(len(b)):
        k = (ord(b[i])-65 + sum1)%26
        res1 += s[k]
        k = (ord(c[i])-65 + sum2)%26
        res2 += s[k] 
    b = res1
    c = res2
    # print(b, c)
    res =""
    for i in range(len(b)):
        k = (ord(b[i])-65 + ord(c[i])-65)%26
        res+=s[k]
    print(res)

    


t = int(input())
for _ in range(t):
    a = input()
    b = a[0:len(a)//2:1]
    c = a[len(a)//2::1]
    if len(a)%2 == 1:
        continue
    xoay(b, c)
    
    

   
# 3
# EWPGAJRB
# BB
# TPQJDRJWSQXGRRIPXFMINTELHBJA