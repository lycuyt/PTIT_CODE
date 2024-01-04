num =1
class Sv:
    def __init__(self, ten, lt, th) :
        self.ten = ten
        self.lt = lt
        self.th = th
        self.tb = (self.lt + self.th)/2
        self.ma = "TS0"+ str(num)
        if self.tb < 5 : self.xh = "TRUOT"
        if self.tb >=5 and self.tb <8 : self.xh = "CAN NHAC"
        if self.tb >= 8 and self.tb<=9.5 : self.xh = "DAT"
        if self.tb > 9.5 : self.xh = "XUAT SAC"

    def __str__(self):
        return f'{self.ma} {self.ten} {"{:.2f}".format(self.tb)} {self.xh}'
def diem(s):
    if float(s) <= 10:
        return float(s)
    else:
        return float(s[0]) + float("0."+ s[1:])
    
# s = diem(str(45))
# print(s)
ds = []
n = int(input())
for _ in range(n):
    ten, lt, th = input(), input(), input()
    ltt= diem(lt)
    thh = diem(th)
    # print(ltt, thh)
    ds.append(Sv(ten, ltt, thh))
    num+=1
ds.sort(key = lambda x: -x.tb)
for i in ds:
    print(i)
    