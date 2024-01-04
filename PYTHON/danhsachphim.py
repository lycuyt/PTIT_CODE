num = 1
list = []
ds = []
class Phim:
    def __init__(self,matheloai, ngay, ten , sl):
        self.ma = "P" + str(num).zfill(3)
        self.matheloai = matheloai
        self.ngay = ngay
        self.day = int(self.ngay[0:2])
        self.month = int(self.ngay[3:5])
        self.year = int(self.ngay[6:])
        self.ten = ten
        self.sl = sl
        self.theloai = list[int(self.matheloai[2:])-1]
    
    def __str__(self) -> str:
        return f'{self.ma} {self.theloai} {self.ngay} {self.ten} {self.sl}'

n, m = map(int, input().split())
for i in range(n):
    list.append(input())

for i in range(m):
    ds.append(Phim(input(), input(), input(), int(input())))
    num+=1

ds.sort(key = lambda x: (x.year, x.month, x.day , x.ten, -x.sl))

for i in ds:
    print(i)
