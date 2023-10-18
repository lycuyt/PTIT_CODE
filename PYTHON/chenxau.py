s1= input()
s2=input()
p= int(input())
if p>len(s1):
    s= s1+s2
else:
    s=s1[:p-1] +s2+ s1[p-1:]
print(s)