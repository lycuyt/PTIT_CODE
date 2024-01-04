from datetime import datetime, date
num = 1
dsmon = {}
ds = []
class cathi:
    def __init__(self, mamh, ngaythi, giothi, nhom):
        self.ma = "T"+ str(num).zfill(3)
        self.mamh = mamh
        self.ngaythi = ngaythi
        self.giothi = giothi
        self.gio = int(self.giothi[0:2])
        self.phut = int(self.giothi[3:])
        self.day = int(self.ngaythi[0:2])
        self.month = int(self.ngaythi[3:5])
        self.year = int(self.ngaythi[6:])
        self.nhom = nhom
        self.tenmon = dsmon[self.mamh]
  

    def __str__(self) -> str:
        return f'{self.ma} { self.mamh} { self.tenmon} {self.ngaythi} {self.giothi} {self.nhom}'

n, m = map(int, input().split())
for i in range(n):
    a = input()
    b= input()
    dsmon[a] = b

for i in range(m):
    a = list(input().split())
    ds.append(cathi(a[0], a[1], a[2] , a[3]))
    num+=1
ds.sort(key = lambda x :(x.year, x.month, x.day,x.gio, x.phut, x.nhom))
for i in ds:
    print(i)
