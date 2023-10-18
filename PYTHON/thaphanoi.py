def thaphanoi(n,a, b, c):
    if n==1 :
        print (str(a)+" -> "+str(c))
        return
    thaphanoi(n-1,a,c, b)
    thaphanoi(1, a, b, c)
    thaphanoi(n-1,b, a, c)
n= int(input())
thaphanoi(n, 'A', 'B', 'C')