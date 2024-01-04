from math import *
from functools import cmp_to_key
import re
import sys

s = ""
while True:
    try: s+=input()
    except EOFError:
        break

s=s.lower()
s= s.replace('!', '.')
s= s.replace('?', '.')
if s[-1] == '.': s= s[0:len(s)-1]
a= list(s.split('.'))
for x in a:
    res = list(x.lower().split())
    tmp = res[0]
    print(tmp[0].upper(), end ='')
    for i in range(1, len(tmp)):
        print(tmp[i], end ='')
    print(' ', end ='')
    for i in range(1,len(res)):
        print(res[i], end = ' ')
    print()
