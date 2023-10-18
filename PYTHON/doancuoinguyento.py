from math import *
def isprime(n):
    if n<2: return False
    for i in range(2,isqrt(n)+1):
        if n%i==0: return False
    return True
def check(s):
    res=""
    for i in range( len(s)-4, len(s)):
        res+=s[i]
    if isprime(int(res)) : return True
    else : return False

t =int(input())
for _ in range(t):
    s = input()
    if check(s): print('YES')
    else: print("NO")