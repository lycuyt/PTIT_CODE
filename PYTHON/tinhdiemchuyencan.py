dd = {}
class Sinhvien:
    def __init__(self, ma , ten, lop, diemdanh):
        self.ma = ma
        self.ten = ten
        self.lop = lop
        self.diemdanh = diemdanh

    def diem(self):
        diem = 10
        for i in range(len(self.diemdanh)):
            if self.diemdanh[i] == 'v' : diem -=2
            elif self.diemdanh[i] == 'm': diem -=1
        if diem < 0: diem = 0
        return diem
    def xh(self):
        if self.diem() == 0 : return "KDDK"  
        else : return ""  
    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.lop} {self.diem()} { self.xh()}'
    
ds = []
n = int(input())
for _ in range(n):
    a = []
    a.append(input())
    a.append(input())
    a.append(input())
    ds.append(a)

# print(ds)

for _ in range(n):
    a = list(input().split())
    dd[a[0]] = a[1]
li =[]
for i in range(n):
    a = ds[i]
    li.append(Sinhvien(a[0], a[1], a[2], dd[a[0]]))

for i in li:
    print(i)


