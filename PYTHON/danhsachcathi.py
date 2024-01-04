num = 1
class cathi:

    def __init__(self, ngay, gio, phong) :
        self.ma = "C" + str(num ).zfill(3)
        self.ngay = ngay
        self.day = int(self.ngay[0:2])
        self.month = int(self.ngay[3:5])
        self.year = int(self.ngay[6:])
        self.gio = gio
        self.gioo = int(self.gio[0:2])
        self.phut = int(self.gio[3:])
        self.phong = phong
    
    def __str__(self) -> str:
        return f'{self.ma} {self.ngay} {self.gio} {self.phong}'
ds = []
with open('CATHI.in', 'r') as file:
    n = int(file.readline())
    for i in range(n):
        ds.append(cathi(file.readline().strip(), file.readline().strip(), file.readline().strip()))
        num+=1

ds.sort(key = lambda x : (x.year, x.month, x.day, x.gioo , x.phut, x.ma))
for x in ds:
    print(x)
    