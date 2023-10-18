from math import *
def isprime(n):
    if n<2: return False
    for i in range(2,isqrt(n)+1):
        if n%i==0: return False
    return True
def check(s):
    ans = s[0:3]
    res=""
    for i in range( len(s)-3, len(s)):
        res+=s[i]
    if isprime(int(res)) and isprime(int(ans)) : return True
    else : return False

t =int(input())
for _ in range(t):
    s = input()
    if check(s): print('YES')
    else: print("NO")