
for _ in range(int(input())):
    n = list(int(i) for i in input())
    idx = -1
    for i in range(len(n)-2, -1, -1):
        if n[i]> n[i+1]:
            idx = i
            break
    # print(idx)
    # so lon nhat nhung nho hon n[idx]
    maxx = -1
    vt = -1
    for i in range(idx+1, len(n)):
        if n[i] < n[idx] :
            if n[i] > maxx : 
                maxx = n[i]
                vt = i
    # print(vt)
    if vt >-1:
        (n[idx], n[vt]) = (n[vt], n[idx])
    
    if (idx == -1) : print(-1)
    elif(n[0] == 0) : print(-1)
    else: 
        for i in n:
            print(i, end='')
        print()
    
    
