import sys


n, m = map(int, sys.stdin.readline().split())

arr = [[0] * n] * n
x1 = [0] * m
y1 = [0] * m
x2 = [0] * m
y2 = [0] * m

for i in range(0, n):
    arr[i] = list(map(int, sys.stdin.readline().split()))

for i in range(0, m):
    x1[i], y1[i], x2[i], y2[i] = map(int, sys.stdin.readline().split())
    x1[i] -= 1
    y1[i] -= 1
    x2[i] -= 1
    y2[i] -= 1

sum_arr = [[0 for _ in range(n+1)] for _ in range(n+1)]

for i in range(1, n+1):
    for j in range(1, n+1):
        sum_arr[i][j] = arr[i-1][j-1] + sum_arr[i-1][j] + sum_arr[i][j-1] - sum_arr[i-1][j-1]

# print('sum_arr : ')
# for i in range(n+1):
#     print(sum_arr[i])

for i in range(0, m):
    print(sum_arr[x2[i]+1][y2[i]+1] - sum_arr[x1[i]][y2[i]+1] - sum_arr[x2[i]+1][y1[i]] + sum_arr[x1[i]][y1[i]])