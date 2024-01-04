num1, num2 = 1, 1
class team:
    def __init__(self, tenteam, tentrg) :
        self.ma = "Team" + str(num1).zfill(2)
        self.tenteam = tenteam
        self.tentrg = tentrg

class thisinh:
    def __init__(self, ten, mateam) :
        self.ma = "C" + str(num2).zfill(3)
        self.ten = ten
        self.mateam = mateam
        self.tenteam = None
        self.tentruong = None
    
    def __str__(self) -> str:
        return f'{self.ma} {self.ten} {self.tenteam} {self.tentruong}'

dsteam = []
dsthisinh =[]
for _ in range(int(input())):
    dsteam.append(team(input(), input()))
    num1+=1

for _ in range(int(input())):
    dsthisinh.append(thisinh(input(), input()))
    num2+=1

for i in range(len(dsthisinh)):
    for j in range(len(dsteam)):
        if dsthisinh[i].mateam == dsteam[j].ma:
            dsthisinh[i].tenteam = dsteam[j].tenteam
            dsthisinh[i].tentruong = dsteam[j].tentrg
            break

dsthisinh.sort(key = lambda x: x.ten)
for x in dsthisinh:
    print(x)
    