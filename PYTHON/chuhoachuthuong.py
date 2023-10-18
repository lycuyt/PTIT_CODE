s= input()
low, up=0,0
for x in s:
    if x>='a' and x<='z': low+=1
    else : up+=1
if(low>=up): print(s.lower())
else: print(s.upper())