from math import *
n= int(input())
a= list(map(int, input().split()))
a.sort()
l= len(a)
print(max(a[l-1]*a[l-2]*a[l-3], a[l-1]*a[l-2], a[0]*a[1]*a[l-1],a[0]*a[1]*a[2]))