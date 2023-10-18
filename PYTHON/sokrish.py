def gt(n):
    if n==0 or n==1 : return 1
    return n*gt(n-1)

def check(n):
    m, sum=n, 0
    while(m!=0):
        r=m%10
        sum+=gt(r)
        m=m//10
    if sum==n : return True
    else: return False

t = int(input())
for _ in range (t):
    n= int(input())
    if check(n):
        print("Yes")
    else:
        print("No")
