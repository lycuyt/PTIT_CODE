
f = open('CONTACT.in', 'r')
a = []
for line in f:
    a.append(line.strip())
b = []
for x in a:
    b.append(x.lower())
c = set(b)
d = sorted(c)
for x in d:
    print(x)