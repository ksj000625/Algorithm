import sys


n = int(sys.stdin.readline())

shape = []
dp = []

for i in range(0, n):
    shape.append(list(map(int,sys.stdin.readline().split())))

dp = shape.copy()

for i in range(1, n):
    for j in range(0, len(shape[i])):
        if j == 0:
            # 처음꺼
            dp[i][j] = dp[i-1][j] + shape[i][j]
        elif j == len(shape[i])-1:
            # 마지막꺼
            dp[i][j] = dp[i-1][j-1] + shape[i][j]
        else:
            # 중간의 경우
            if dp[i-1][j-1] < dp[i-1][j]:
                dp[i][j] = dp[i-1][j] + shape[i][j]
            else:
                dp[i][j] = dp[i-1][j-1] + shape[i][j]


print(max(dp[n-1]))