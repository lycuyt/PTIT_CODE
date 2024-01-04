
t= int(input())
for _ in range(t):
    d=[0]*10
    a, b =  map(int, input().split())
    # if a>b: a,b=b, a
    for i in range(a, b+1):
       c= list(int(i) for i in str(i))
       for j in range(len(c)):
           d[c[j]]+=1
    
    for i in range(10):
        print(d[i], end= ' ')
    print()
    
