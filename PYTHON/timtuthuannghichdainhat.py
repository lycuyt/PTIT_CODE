
def falind (s) : return s == s[::-1]

f = open('VANBAN.in','r')
d = {}
a = f.read().split()
for x in a:
    if falind(x):
        if x not in d: d[x] =1
        else: d[x] +=1

res = 0
for key in d.keys() : 
    res = max (res, len(key))
for x in a:
    if falind(x) and len(x) == res and d[x] >0:
        print(x, d[x])
        d[x] =0
