from math import *
import io, os, sys,time
import array as arr

class Ponts:
    def __init__(self, x, y):
        self.x = x
        self.y =y
    def distance(self, other):
        return (sqrt(pow(self.x - other.x, 2)+pow(self.y - other.y, 2)))

class Triagle:
    def __init__(self, a, b, c):
        self. a= a
        self.b = b
        self. c= c
    def perimeter(self):
        return self.a + self.b + self.c
res=[]  
t = int(input())
for _ in range(t):
    res+=[float(i) for i in input().split()]
i=0
for _ in range(t):
    
    x = Ponts(res[i], res[i+1])
    y = Ponts(res[i+2], res[i+3])
    z = Ponts(res[i+4], res[i+5])
    m, n, k = x.distance(y), x.distance(z), y.distance(z)
    if n > 0 and n> 0 and k>0 and n+m> k and n+k>m and k+m> n :
        tr = Triagle(n, m, k)
        print('{:.3f}'.format(tr.perimeter()))
    else:
        print('INVALID')
    i+=6