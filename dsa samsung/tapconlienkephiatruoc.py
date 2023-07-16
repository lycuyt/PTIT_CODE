def check(x, a, k):
    for i in range(k):
        if x == a[i]:
            return 0
    return 1

def checkcuoi(a, n, k):
    for i in range(k):
        if a[i] != i + 1:
            return 0
    return 1

t = int(input())

for _ in range(t):
    n ,k =map(int, input().split())
    a = [0] * (k + 1)  # Khởi tạo mảng với kích thước đủ lớn
    b=list(map(int, input().split()))
    for i in range(k):
        a[i] = b[i]

    if checkcuoi(a, n, k) == 1:
        for i in range(k, n + 1):
            print(i, end=" ")
    else:
        i = k - 1
        while i >= 0 and a[i] == a[i - 1] + 1:
            i -= 1
        if i != -1:
            a[i] -= 1
        for j in range(i + 1, k + 1):
            a[j] = n - k + j + 1
        for j in range(k):
            print(a[j], end=" ")

    print()
