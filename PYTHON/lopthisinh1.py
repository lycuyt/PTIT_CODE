class TS:
    def __init__(self, name, birth, mon1, mon2, mon3):
        self.name = name
        self.birth = birth
        self.mon1 = mon1
        self.mon2 = mon2
        self.mon3 = mon3
        self.tong = mon1+mon2+mon3
      
    def __str__(self):
        
        return self.name + ' ' + self.birth + ' ' + ('%.1f' % (self.tong))

name = input()   
birth = input()
d1 = float(input())
d2 = float(input())
d3 = float(input())

ts = TS(name, birth, d1, d2, d3)
print(ts)