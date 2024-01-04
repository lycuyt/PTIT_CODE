num = 1
class Hocsinh:
    def __init__(self, ten, dtb):
        self.ten = ten
        self.dtb = dtb
        self.ma = "HS"+ str(num).zfill(2)
    def xephang(self):
        if self.dtb >=9 : return "XUAT SAC"
        if self.dtb >=8 and self.dtb <=8.9: return "GIOI"
        if self.dtb >=7 and self.dtb <=7.9: return "KHA"
        if self.dtb >=5 and self.dtb <= 6.9 : return "TB"
        return "YEU"
    def __str__ (self):
        return f'{self.ma} {self.ten} {self.dtb} {self.xephang()}'
  
ds =[]
n = int(input())
for _ in range(n):
    ten = input()
    a = list(map(float, input().split()))
    
    sum =0
    for i in range(10):
        if i == 0 or i ==1:
            sum+=a[i]*2
        else: sum+=a[i]
    
    ds.append(Hocsinh(ten, round(sum/ 10/ 1.2, 1)))
    num+=1
ds.sort(key = lambda x :(-x.dtb, x.ma))
for i in ds:
    print(i)

    
    

        