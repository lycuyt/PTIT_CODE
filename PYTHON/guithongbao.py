from math import *

t = int(input())
for _ in range(t):
    s= input()
    if len(s)<=100: print(s)
    else:
        if s[99]==' ':
            for i in range (100):
                print(s[i],end='')
        else:
            if s[99]==' ':
                for i in range (100):
                    print(s[i], end='')
            else:
                # tim dau cach dau tien phia trc
                vt=0
                j=99
                while s[j] != ' ':
                    j-=1;
                vt=j
                for i in range(0, vt +1):
                    print(s[i], end='')
    print()
