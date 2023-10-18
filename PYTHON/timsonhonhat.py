t= int(input())
for _ in range(t):
    s= input() # nhap vao 1 string
    #cho cac so vao 1 list, sap xep , lay phan tu be nhat
    res=' '
    for i in range(len(s)):
        if(s[i].isalpha()): res+=' '
        else : res+=s[i]        
    a= map(int, res.split())
    print(min(a))


            

