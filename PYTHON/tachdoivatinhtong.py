from math import *
s = input()

while(1):
    # tach doi xau s
    if len(s)==1:
        break
    s1=""
    s2=""
    for i in range(0, len(s)//2):
        s1+=s[i]
    
    for i in range(len(s)//2, len(s)):
        s2+=s[i]
    
    res= int(s1)+ int(s2)
    print(res)
    s= str(res)