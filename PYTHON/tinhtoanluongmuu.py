a={}# tu dien de luu ma mon -> ten mon
n, m=map(int, input().split())

class cathi:
    def __init__(self, macathi, mamon, ngaythi, giothi, nhomthi):
        self.macathi=macathi
        self.ngaythi=ngaythi
        self.giothi=giothi
        self.nhomthi=nhomthi
        self.tenmon=a[mamon]
        self.mamon=mamon
    def __str__(self):
        return f'{self.macathi} {self.mamon} {self.tenmon} {self.ngaythi} {self.giothi} {self.nhomthi}'
    def tinhngay(self):
        s=self.ngaythi
        return int(s[6:]+s[3:5]+s[0:2])
    def tinhgio(self):
        s=self.giothi
        return int(s[0:2]+s[3:])

for i in range(n):
    k=input()
    v=input()
    a[k]=v

list=[]
for i in range(m):
    mamon, ngay, gio, nhom=input().split()
    list.append(cathi("T"+str(i+1).zfill(3), mamon, ngay, gio, nhom))
list.sort(key=lambda x:(x.tinhngay(), x.tinhgio(), x.nhomthi))
for x in list:
    print(x)
