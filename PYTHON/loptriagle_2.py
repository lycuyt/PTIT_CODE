from math import *


class Point:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def distance(self, other):
        return sqrt(pow(self.a - other.a, 2) + pow(self.b - other.b, 2))


class Triangle:
    def __init__(self,a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def area(self):
        S = sqrt((self.a + self.b + self.c) * (self.a + self.b - self.c) * (self.a + self.c - self.b) * (
                -self.a + self.b + self.c))/4
        return "{:.2f}".format(S)



res = []
t = int(input())
for _ in range(t):
    res += [float(i) for i in input().split()]
i = 0
for _ in range(t):
    p1 = Point(res[i], res[i + 1])
    p2 = Point(res[i + 2], res[i + 3])
    p3 = Point(res[i + 4], res[i + 5])
    a = p1.distance(p2)
    b = p2.distance(p3)
    c = p1.distance(p3)
    if max(a, b, c) * 2 >= a + b + c:
        print("INVALID")
    else:
        tri = Triangle(a, b, c)
        print(tri.area())
    i += 6
