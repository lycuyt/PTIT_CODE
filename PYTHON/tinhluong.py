ds = {}
list =[]
class Nhanvien:
    def __init__(self, ma, ten ,luongcb, songay) :
        self.ma = ma
        self.ten = ten
        self.luongcb = luongcb
        self.songay = songay

        self.mapl = self.ma[0:1]
        self.manam = int(self.ma[1:3])
        self.mapb = self.ma[3:]
        self.tenpb = ds[self.mapb]

        self.tong = self.luongcb*self.songay

        if self.mapl == "A":
            if self.manam >=1 and self.manam <=3 : self.tong*=10
            elif self.manam >=4 and self.manam <=8 : self.tong*=12
            elif self.manam >=9 and self.manam <=15 : self.tong*=14
            else : self.tong *= 20
        elif self.mapl == "B":
            if self.manam >=1 and self.manam <=3 : self.tong*=10
            elif self.manam >=4 and self.manam <=8 : self.tong*=11
            elif self.manam >=9 and self.manam <=15 : self.tong*=13
            else : self.tong *= 16
        elif self.mapl == "C" :
            if self.manam >=1 and self.manam <=3 : self.tong*=9
            elif self.manam >=4 and self.manam <=8 : self.tong*=10
            elif self.manam >=9 and self.manam <=15 : self.tong*=12
            else : self.tong *= 14
        elif self.mapl == "D":
            if self.manam >=1 and self.manam <=3 : self.tong*=8
            elif self.manam >=4 and self.manam <=8 : self.tong*=9
            elif self.manam >=9 and self.manam <=15 : self.tong*=11
            else : self.tong *= 13

    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.tenpb} {self.tong*1000}'

for _ in range(int(input())):
    s = input()
    a = s[0:2]
    b = s[3:]
    ds[a] = b
# for key, val in ds.items():
#     print(key, val)
for _ in range(int(input())):
    list.append(Nhanvien(input(), input(), int(input()), int(input())))
for x in list:
    print(x)
