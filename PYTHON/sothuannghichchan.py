def check(n):
    m= n[::-1]
    if n!=m : return False
    if len(n)%2==1: return False
    a=list(int(i) for i in n)
    for x in a:
        if x%2==1: return False
    return True
t= int(input())
for _ in range(t):
    n= input()
    for i in range(int(n)):
        if check(str(i)): print(i, end=' ')
    print()