num = 1
class Khachhang:
    def __init__(self, ten, socu, somoi):
        self.ten = ten
        self.somoi = somoi
        self.socu = socu
        self.ma = "KH" + str(num).zfill(2)
        self.so = self.somoi - self.socu
        if self.so >= 0 and self.so <=50 : self.tien = round(self.so * 100 *1.02)
        if self.so >=51 and self.so<=100: self.tien = round((50*100 + (self.so -50)*150)*1.03)
        if self.so >= 100: self.tien = round((50*100 + 50*150 +(self.so - 100)*200)*1.05)
    
    def __str__(self):
        return f'{self.ma} {self.ten} { self.tien}'

ds = []
n =int (input())
for _ in range(n):
    ds.append(Khachhang(input(), int(input()), int(input())))
    num+=1
ds.sort(key = lambda x:(-x.tien))
for i in ds:
    print(i)