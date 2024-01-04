v = 120
class thisinh:
    def __init__(self, ten, donvi, den):
        self.ten = ten
        self.donvi = donvi
        self.den = den

        self. ma = ""
        a = list(self.donvi.split())
        for i in a:
            self.ma+= i[0].upper()
        b = list(self.ten.split())
        for i in b:
            self.ma+=i[0].upper()
    
    def vt(self):
        a = list(self.den.split(":"))
        return 120/(int(a[0]) *60 + int(a[1]) - 6*60)*60
    
    def __str__(self) -> str:
        
        return f'{self.ma} {self.ten} {self.donvi} {round(self.vt())} {"Km/h"}'

ds = []
for _ in range(int(input())):
    ds.append(thisinh(input(), input(), input()))

ds.sort(key = lambda x: -x.vt())
for i in ds : print(i)