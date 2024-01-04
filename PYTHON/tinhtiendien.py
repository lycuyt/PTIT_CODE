num = 1
class Khachhang:
    def __init__(self, ten, loai, start, end) :
        self.ten = ten
        self.loai = loai
        self.start = start
        self.end = end
        self.ma = "KH" + str(num).zfill(2)
        self.sodien = self.end -self.start
        if self.loai == "A" : self.dm = 100
        elif self.loai == "B": self.dm = 500
        else : self.dm = 200

        if self.sodien <self.dm :
            self.tientrongdm = self.sodien*450
        else:
            self.tientrongdm = self.dm *450

        if self.sodien > self.dm :
            self.tienvuotdm = (self.sodien - self.dm) *1000
        else:
            self.tienvuotdm = 0
        
        self.thue = self.tienvuotdm//20

        self.tong = self.tientrongdm+self.tienvuotdm+self.thue
    
    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.tientrongdm} {self.tienvuotdm} {self.thue} {self.tong}'

def chuanhoa(s):
    a = list(s.split())
    res=""
    for i in a:
        res+=i[0].upper() + i[1:].lower()+" "
    return res[0:len(res) -1]

ds = []
for _ in range(int(input())):
    ten = input().strip()
    s = input()
    a =list(map(str, s.split()))
    
    ds.append(Khachhang(chuanhoa(ten), a[0], int(a[1]) , int(a[2])))
    num+=1
ds.sort(key = lambda x: -x.tong)
for x in ds: 
    print(x)
