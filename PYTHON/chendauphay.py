s= input()
# cu ba so tu cuoi lai thi them dau phay
res=""
k= len(s)%3
ss= s[::-1]
# print(ss)
for i in range(0,len(ss)-k, 3):
    res+=ss[i]+ss[i+1]+ss[i+2]
    if(i+2 != len(ss)-1): res+=","
for i in range(len(s)-k, len(s)):
    res+=ss[i]
print(res[::-1])
    
