from math import *

s="0ABCDEFGHIJKLMNOPQRSTUVWXYZ"
# print(len(s))
def slove(n, k):
    m=2**(n-1)
    if k==1: return s[1]
    if k==m: return s[n]
    if k<m:
        return slove(n-1, k)
    else:
        return slove(n-1, k-m)

t= int(input())
for _ in range(t):
    n, k= map(int, input().split())
    print(slove(n, k))