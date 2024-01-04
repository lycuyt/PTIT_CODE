num = 1
class GV:
    def __init__(self, ten, maxt, tin, cm):
        self.ten = ten
        self.maxt = maxt
        self.tin= tin
        self.cm = cm
        self.ma = "GV" + str(num).zfill(2)
        if self.maxt[0] == 'A': self.mon = "TOAN"
        elif self.maxt[0] == 'B': self.mon = "LY"
        else : self.mon = "HOA"

        if self.maxt[1] == '1': self.ut = 2.0
        elif self.maxt[1] == '2': self.ut = 1.5
        elif self.maxt[1] == '3': self.ut = 1.0
        else : self.ut = 0

        self.tong = self.tin*2 + self.cm + self.ut

        if self.tong>=18 : self.xh = "TRUNG TUYEN"
        else : self.xh = "LOAI"
    
    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.mon} {"{:.1f}".format(self.tong)} {self.xh}'

ds = []
for _ in range(int(input())):
    ds.append(GV(input(), input(), float(input()), float(input())))
    num+=1

ds.sort(key = lambda x: -x.tong)
for i in ds:
    print(i)
    