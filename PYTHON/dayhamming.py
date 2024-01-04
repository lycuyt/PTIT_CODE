from queue import Queue
import heapq
d = {1 : 1}

def hamming():
    q, s = [1], {1}
    while len(q) > 0:
        x = heapq.heappop(q) # lay ra phan tu nho nhat 
        if x > 10 ** 18: break
        if x * 2 not in s:
            heapq.heappush(q, x * 2)
            s.add(x * 2)
        if x * 3 not in s:
            heapq.heappush(q, x * 3)
            s.add(x * 3)
        if x * 5 not in s:
            heapq.heappush(q, x * 5)
            s.add(x * 5)
    l = 1
    for x in sorted(list(s)):
        d[x] = l
        l += 1
hamming()
for _ in range(int(input())):
   
    n = int(input())
    if n in d :
        print(d[n])
    else:
        print('Not in sequence')
