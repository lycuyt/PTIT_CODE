def hoanvi(s):
    global vs, n
    if len(s) == len(n):
        print(s)
        return
    for i in range(len(n)):
        if vs [i] == 0:
            vs[i] = 1
            hoanvi(s+n[i])
            vs[i] = 0
n = input()
vs = [0] *len(n)
hoanvi("")