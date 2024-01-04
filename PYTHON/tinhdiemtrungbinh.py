from math import*
num = 1

class Sinhvien:
    def  __init__(self, ten , diem1, diem2, diem3) :
        self.ma = "SV" + str(num).zfill(2)
        self.ten = ten
        self.diem1 = diem1
        self.diem2 = diem2
        self.diem3 = diem3

        self.tong = '{:.2f}'.format((diem1*3 + diem2*3 + diem3*2)/8+0.001)
        self.rank = None

    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.tong} {self.rank}'

def chuanhoa(s):
    a = list(s.split())
    res=""
    for i in a:
        res+=i[0].upper() + i[1:].lower()+" "
    return res[0:len(res) -1]
ds = []
for _ in range(int(input())):
    ds.append(Sinhvien(chuanhoa(input()), float(input()),float(input()), float(input()) ))
    num+=1
ds.sort(key = lambda x: (-float(x.tong), x.ma))
ds[0].rank = 1
for  i in range(1, len(ds)):
    if ds[i].tong == ds[i-1].tong :
        ds[i].rank = ds[i-1].rank
    else :
        ds[i].rank = i+1
for i in ds:
    print(i)


