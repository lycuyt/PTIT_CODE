
def sinhtohop(i):
    global n, k, x,c
    for j in range(x[i-1]+1, n-k+i+1):
        x[i] = j
        if i == k:
            for l in range(1, k+1):
                print(c[x[l]-1], end= ' ')
            print()
        else:
            sinhtohop(i+1)
    

n, k = map(int, input().split())
a = list(map(int, input().split()))
b = set(a)
c = list(b)
c.sort()
n = len(c)
# print(*c)
x = [0] * len(c)
sinhtohop(1)
