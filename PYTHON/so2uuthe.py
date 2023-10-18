from math import *
import queue
def check(s):
    cnt=0
    for x in s:
        if x=='2': cnt+=1
    if cnt>len(s)//2 and s[0]!='0' : return True
    else : return False
list=[]
def backtrack():
    a= queue.Queue()
    a.put('1')
    a.put('2')
    l=0
    while(l<=9):
        x= a.get()
        if check(x) : list.append(x)
        a.put(x+'0')
        a.put(x+'1')
        a.put(x+'2')
        l= len(x)

t= int(input())
backtrack()
for _ in range(t):
    n= int(input())
    # liet ke n so tam phan dau tien
    for i in range(n): print(list[i], end = ' ')
    print()