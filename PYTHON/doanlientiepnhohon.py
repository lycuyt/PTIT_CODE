from math import *
t=int(input())
for _ in range(t):
    n= int(input())
    a= list ( map(int, input().split()))
    d=[0]*(n)
    st = []
    i = 0
    for i in range (len(a)):
        if(len(st) > 0 and a[i]>= a[st[-1]]):
            while len(st) > 0 and a[i]>=a[st[-1]]:
                st.pop()

        if len(st)==0 :d[i]=i+1 
        else :d[i] = i - st[-1]

        st.append(i)
        # print(*st)
    print(*d)
    print()