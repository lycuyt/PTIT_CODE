n= int(input())
listt= list(map(int, input().split()))
i = 1
while i < len(listt):
    if (listt[i-1]+listt[i]) % 2 == 0:
        listt.pop(i)
        listt.pop(i-1)
        if i > 1:
            i -= 1
    else:
        i += 1
print(len(listt))

