class MH:
    def __init__(self, ma, ten, sl, dg, ck):
        self.ma = ma
        self.ten = ten
        self.sl = sl
        self.dg = dg
        self.ck = ck
        self.tong = self.sl * self.dg - self.ck
    def __str__(self) -> str:
        return f'{self.ma} { self.ten} {self.sl} {self.dg} {self.ck} {self.tong}'

ds = []
for _ in range(int(input())):
    ds.append(MH(input(), input(), int(input()), int(input()), int(input())))
ds.sort(key = lambda x: -x.tong)
for i in ds:
    print(i)