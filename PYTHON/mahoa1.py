from collections import Counter
t = int(input())
for _ in range(t):
    s = input()+"?"
    #cac ki tu lien tiep bang nhau
    dem=0
    ch=s[0]
    for x in s:
        if x==ch :
            dem+=1
        else:
            print(str(dem)+ch, end='')
            dem=1
            ch=x
    print()
    