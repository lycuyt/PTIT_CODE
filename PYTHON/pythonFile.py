import re
s = input().lower()
pattern = r'^[a-zA-Z._]+$'
if re.match(pattern, s) and s[-3:] == ".py" and len(s)<=128 and len(s)>=1:
    print ("yes")
else : print ("no")