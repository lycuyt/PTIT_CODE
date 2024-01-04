import sys
a = []
with open('DATA.in', 'r') as f:

    for line in f:
        s = line.strip().split()
        for x in s:
            if  not x.isdigit():
                a.append(x)
            elif(x.isdigit() and int(x) > sys.maxsize):
                a.append(x)
           
a.sort()
print(*a)