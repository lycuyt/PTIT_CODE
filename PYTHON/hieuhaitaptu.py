with open('DATA1.in', 'r')as f1: set1 = set(f1.read().lower().split())
with open('DATA2.in', 'r')as f2: set2= set(f2.read().lower().split())
print(' '.join(sorted(set1.difference(set2))))
print(' '.join(sorted(set2.difference(set1))))