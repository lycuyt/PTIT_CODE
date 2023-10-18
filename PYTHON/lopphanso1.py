from math import *
class Phanso:
    def __init__(self, x, y):
        self.__x =x
        self.__y =y
    def rutgon(self):
        a = gcd(self.__x, self.__y)
        self.__x //=a
        self.__y //=a
        return self
    def __str__(self):
        return f'{self.__x}/{self.__y}'

x,y = map(int, input().split())
       
p = Phanso(x, y)
p.rutgon()
print(p)