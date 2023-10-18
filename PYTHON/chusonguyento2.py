from math import *

res = "2357"
def check(res):
    a = list(x for x in res)
    b = set(a)
    if len(b) == 4 : return True
    else : return False

def backtrack(i, s, k):
    if i == k :
        if(s[k-1] != '2' and check(s)):
            print(s)
        return
    for j in range(4):
        backtrack(i+1,s+res[j],k)

n = int(input())
for k in range(4,n+1):
    backtrack(0,"",k)

