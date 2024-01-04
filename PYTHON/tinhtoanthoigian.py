class Gamer:
    def __init__(self, ma, ten, vao, ra) :
        self.ma = ma
        self.ten = ten
        self.vao = vao
        self.ra = ra
        self.tg = int(self.ra[0:2] )*60 + int(self.ra[3:]) - int(self.vao[0:2] )*60 - int(self.vao[3:])

    def tinhtg(self):
        
        return str(self.tg//60) + " gio "+str(self.tg % 60)+" phut"
    
    def __str__(self) -> str:
        return f'{self.ma}  {self.ten} {self.tinhtg()}'

ds = []
n = int(input())
for _ in range(n):
    ds.append(Gamer(input(), input(), input(), input()))
ds.sort(key = lambda x:(-x.tg))
for i in ds:
    print(i)