class sophuc:
    def __init__(self, thuc, ao):
        self.thuc = thuc
        self.ao = ao
    
    def __add__(self, other):
        res = sophuc(0,0)
        res.thuc = self.thuc + other.thuc
        res.ao = self.ao + other.ao
        return res
    
    def __mul__(self, other):
        res = sophuc(0, 0)
        res.thuc = self.thuc * other.thuc - self.ao * other.ao
        res.ao = self.thuc*other.ao + self.ao * other.thuc
        return res
    
    def __str__(self):
        res=""
        res+=str(self.thuc)
        if self.ao >0 : res+=' + '
        else: res+=' - '
        res+=str(abs(self.ao)) +'i'
        return res

for t in range(int(input())):
    a, b, c , d = map(int, input().split())
    n = sophuc(a, b)
    m = sophuc(c, d)
    kq1 = (n + m) * n
    kq2 = (n + m) * (n + m)
    print(kq1,", ", kq2, sep='')
