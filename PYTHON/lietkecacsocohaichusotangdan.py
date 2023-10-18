from math import *

s= input()
k= int(input())
a=[]
for i in range(0,len(s)-1, 2):
    res=""
    res+=s[i]
    res+=s[i+1]
    a.append(int(res))
# print(a)
a.sort()
d = [0]*100
for i in range(len(a)):
    d[a[i]]+=1
kt=0
for i in range(len(a)):
    if d[a[i]]>=k:
        print(a[i], d[a[i]])
        kt=1
        d[a[i]]=0
if kt==0: print("NOT FOUND")
