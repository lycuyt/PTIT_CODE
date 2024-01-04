class Tram:
    def __init__(self, ten, tg, lm):
        self.ten = ten
        self.tg = tg
        self.lm = lm
    def Add(self, thoigian, luongmua):
        self.tg += thoigian
        self.lm +=luongmua
    
    def trungbinh(self):
        return "{:.2f}".format(self.lm/(self.tg/60))

def tinh(t1, t2):
    return int(t2[0:2])*60 + int(t2[3:])- int(t1[0:2])*60 - int(t1[3:])

a=[]

n = int(input())

for _ in range(n):
    idx = -1
    ten, t1, t2, lm = input(), input(), input(), int(input())
    for i in range(len(a)):
        if a[i].ten == ten :
            idx = i
            break
    if idx == -1:
        a.append(Tram(ten, tinh(t1, t2), lm))
    else:
        a[idx].Add(tinh(t1, t2), lm)
    
for i in range(len(a)):
    print("T0"+str(i+1),a[i].ten, a[i].trungbinh())