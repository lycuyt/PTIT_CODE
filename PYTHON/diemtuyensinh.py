num = 1
class Hocsinh:
    def __init__(self, ten, diemthi, dt, kv) :
        self.ten = ten
        self.diemthi = diemthi
        self.dt = dt
        self.kv = kv
        self.ma = "TS" + str(num).zfill(2)

        self.tongdiem = self.diemthi
        if self.dt != "Kinh": self.tongdiem+=1.5
        if self.kv == 1 : self.tongdiem+=1.5
        elif self.kv == 2: self.tongdiem+=1

        if self.tongdiem>=20.5 : self.dg = "Do"
        else: self.dg = "Truot"
    
    def __str__(self) -> str:
        return f'{self.ma} { self.ten} {"{:.1f}".format(self.tongdiem)} {self.dg}'
def chuanhoa(s):
    a = list(s.split())
    res=""
    for i in a:
        res+=i[0].upper() + i[1:].lower()+" "
    return res[0:len(res) -1]
ds = []
for _ in range(int(input())):
    ds.append(Hocsinh(chuanhoa(input()) , float(input()), input(), int(input())))
    num+=1
ds.sort(key = lambda x:(-x.tongdiem, x.ma))
for x in ds:
    print(x)