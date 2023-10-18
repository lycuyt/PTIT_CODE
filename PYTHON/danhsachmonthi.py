from math import *

a =[]
t =int(input())
for _ in range(t):
    d={}
    d['id'] = input()
    d['name'] = input()
    d['form'] = input()
    a.append(d)

c = sorted(a, key = lambda x: (x['id']))
for x in c:
    for key, val in x.items():
        print( val, end =' ')
    print()

# 2
# MUL1320
# Nhap mon da phuong tien
# Bai tap lon + Van dap truc tuyen
# BAS1203
# Giai tich 1
# Thi viet + Van dap truc tuyen