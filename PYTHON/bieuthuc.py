for i in range(int(input())):
    s = input()
    res = ""
    for x in s:
        if x =='(' or x == ')':
            res+=x
    # print(res)
    # tim xem no la cai mo ngoac thu may
    st = []
    d = [0] * (len(res))
    # print(*d)
    idx = 0
    for i in range(len(res)):
        if len(st) > 0 and res[i] == ')' and res[st[len(st) -1 ]]== '(':
            
            d[i] = d[st[len(st) -1 ]] 
            st.pop()
        else :
            st.append(i)
            idx+=1
            d[i] = idx
    print(*d)

