from math import *
class Phanso:
    def __init__(self, x=None, y=None):
        self.__x =x
        self.__y =y
    def rutgon(self):
        a = gcd(self.__x, self.__y)
        self.__x //=a
        self.__y //=a
        return self
    def __add__(self, other):
        a = self.__x
        b = self.__y
        self.__x = a*other.__y + b*other.__x
        self.__y = b * other.__y
        self.rutgon()
        return self

    def __str__(self):
        return f'{self.__x}/{self.__y}'

x,y, z, t = map(int, input().split())
# print(x, y, z, t)      
p = Phanso(x, y)
q= Phanso(z, t)
c=p+q
print(c)