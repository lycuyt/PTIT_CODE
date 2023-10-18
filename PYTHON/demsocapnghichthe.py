from math import *
def merge(a, l, m, r):
    n1= m-l+1
    n2 = r-m
    L = [0]*n1
    R=[0]*n2
    for i in range(n1):
        L[i]=a[l+1]
    for i in range(n2):
        R[i]=a[m-1-i]

n= int (input())
a=list(map(int, input().split()))