from math import *
def check(s):
    if len(s)%2==0: return False
    if s[0]==s[1] : return False
    s="y"+s
    for i in range(1, len(s)-2, 2):
        if s[i]!=s[i+2]: return False
    return True
t = int(input())
for _ in range(t):
    s = input()
    if check(s): print('YES')
    else: print("NO")