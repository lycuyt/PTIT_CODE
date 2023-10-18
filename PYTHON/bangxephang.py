
ten =[]
n = int(input())
for i in range(n):
    d={}
    d['ten']=input()
    c, t = map(int, input().split())
    d['bai'] = c
    d['nop'] = t
    ten.append(d)

c = sorted(ten, key = lambda x:(-x['bai'], x['nop'], x['ten']))
for x in c:
    for key, val in x.items():
        print( val, end =' ')
    print()



    


    