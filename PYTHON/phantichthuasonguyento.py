from math import *
t= int(input())
for _ in range(t):
    n= int(input())
    m=n
    print("1 * ", end='')
    for i in range(2,isqrt(m)+1):
        cnt=0
        if n%i==0:
            while n%i==0:
                cnt+=1
                n=n//i
            print(str(i)+"^"+str(cnt), end='')
            if(n!=1): print(" * ", end='')
            cnt=0
    if(n!=1):
        print(str(n)+"^"+str(1), end='')
    print()
        
            

    
        