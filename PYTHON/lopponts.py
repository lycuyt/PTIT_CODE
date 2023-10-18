from math import *
class Pont:
    def __init__(self,x, y):
        self.x =x
        self.y=y
    def distance(self , other):
        return '{:.4f}'.format(sqrt((pow(self.x - other.x, 2) + pow(self.y - other.y, 2))))
t=int(input())
for _ in range(t):
    a=list(map(float, input().split()))
    p1 = Pont(a[0], a[1])
    p2 = Pont(a[2],a[3])
    print(p1.distance(p2))
        