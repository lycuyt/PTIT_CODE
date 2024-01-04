class lienlac:
    def __init__(self, ten, sdt, ngay) :
        self.ten = ten
        self.sdt= sdt
        self.ngay = ngay
        self.layten = self.ten.split()[-1]
    
    def str(self):
        return self.ten+": "+ self.sdt+" "+ self.ngay

f = open('SOTAY.txt', 'r')
s = f.read().split('\n')
ds = []
while len(s)>0:
    x = s[0]
    s.pop(0)
    if x[0:4] == "Ngay" : ngay = x[5:]
    elif len(s) > 0:
        ten = x
        sdt = s[0]
        s.pop(0)
        ds.append(lienlac(ten, sdt, ngay)) 
ds.sort(key = lambda x:(x.layten, x.ten))
f.close()
o = open('DIENTHOAI.txt', 'w')
for x in ds:
    o.write(x.str() +'\n')
o.close()