class monthi:
    def __init__(self, mamon, tenmon, ht) :
        self.mamon = mamon
        self.tenmon = tenmon
        self.ht = ht
num= 1
class cathi:
    def __init__(self, ngaythi, giothi, phong) :
        self.ma = "C" + str(num).zfill(3)
        self.ngaythi = ngaythi
        self.giothi = giothi
        self.phong = phong

class lichthi:
    def __init__(self, macathi, mamon, manhom, sl ) :
        self.macathi = macathi
        self.mamon = mamon
        self.manhom = manhom
        self.sl  = sl
        self.tenmon =None
        self.ngaythi = None
        self.giothi = None
        self.phong = None

        self.day = None
        self.month = None
        self.year = None

        self.gio = None
        self.phut = None
    
    def __str__(self) -> str:
        return f'{self.ngaythi} {self.giothi} {self.phong} {self.tenmon} {self.manhom} {self.sl}'

dsmon = []
dscathi = []
dslichthi = []

f1, f2, f3 = open('MONTHI.in', 'r'), open('CATHI.in', 'r'), open('LICHTHI.in', 'r')
a, b, c = f1.read().split('\n'), f2.read().split('\n'), f3.read().split('\n')

n = int(a[0])
idx = 1
for i in range(n):
    dsmon.append(monthi(a[idx], a[idx+1], a[idx+2]))
    idx +=3
m= int(b[0])
idx = 1
for i in range(m):
    dscathi.append(cathi(b[idx], b[idx+1], b[idx+2]))
    idx +=3
    num+=1
idx = 1
p = int(c[0])
for i in range(p):
    tmp = c[idx].split()
    dslichthi.append(lichthi(tmp[0], tmp[1], tmp[2], tmp[3]))
    idx+=1
for i in range(p):
    for j in range (n):
        if dslichthi[i].mamon == dsmon[j].mamon:
            dslichthi[i].tenmon = dsmon[j].tenmon
            break
    for j in range(m):
        if dslichthi[i].macathi == dscathi[j].ma:
            dslichthi[i].ngaythi = dscathi[j].ngaythi
            dslichthi[i].giothi = dscathi[j].giothi
            dslichthi[i].phong = dscathi[j].phong

            dslichthi[i].day = int(dslichthi[i].ngaythi[0:2])
            dslichthi[i].month = int(dslichthi[i].ngaythi[3:5])
            dslichthi[i].year = int(dslichthi[i].ngaythi[6:])

            dslichthi[i].gio = int(dslichthi[i].giothi[0:2])
            dslichthi[i].phut = int(dslichthi[i].giothi[3:])
            break

dslichthi.sort(key = lambda x:(x.year, x.month, x.day, x.gio, x.phut, x.macathi))
for x in dslichthi:
    print(x)
