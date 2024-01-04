from datetime import datetime
num = 1

class Khachhang:
    def __init__(self, ten, sophong, nhan, tra, dv) :
        self.ten = ten
        self.sophong = sophong
        self.nhan = nhan
        self.tra = tra
        self.dv = dv
        self.ma = "KH"+str(num).zfill(2)

        np = datetime.strptime(self.nhan , "%d/%m/%Y")
        tp = datetime.strptime(self.tra, "%d/%m/%Y")

        self.songay = (tp - np).days + 1

        if self.sophong[0] == '1' : self.dg = 25
        elif self.sophong[0] == '2':self.dg = 34
        elif self.sophong[0] == '3' : self.dg = 50
        else : self.dg = 80

        self.tien = self.dg * self.songay + self.dv
    
    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.sophong} {self.songay} {self.tien}'

ds = []
for _ in range(int(input())):
    ds.append(Khachhang(input().strip(), input().strip(), input().strip(), input().strip(), int(input())))
    num+=1
ds.sort(key = lambda x : -x.tien)
for i in ds:
    print(i)

