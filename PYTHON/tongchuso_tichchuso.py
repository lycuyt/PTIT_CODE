from math import *

t =int(input())
for _ in range(t):
    s = input()
    sum = 0
    kt =0
    tich =1
    for i in range(len(s)):
        if i%2==1:
            sum+=int(s[i])
        else:
            if s[i]!='0':
                kt=1
                tich*=int(s[i])
    
    if kt==1:
        print(tich, end=' ')
    else:
        print(0, end=' ')
    print(sum)