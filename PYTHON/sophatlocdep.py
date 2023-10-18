from math import *
def check(s):
    # xau s chi duoc tao nen tu chuoi a, b, c
    s=s.replace(c, "l")
    s=s.replace(b, "l")
    s=s.replace(a, "l")
    # print(s)
    for x in s:
        if x!='l': return False
    return True

# t =int(input())
a="6"
b="68"
c="688"
# for _ in range(t):
s= input()
if check(s): print("YES")
else : print("NO")