from math import *
import re
s=""
regex = "[\w\s,:]+"
while True:
    try: s+=input()
    except EOFError: break

s=re.findall(regex, s)
# print(s)
for x in s:
    res = x.lower().split()
    res[0]=res[0].title()
    print(' '.join(res))