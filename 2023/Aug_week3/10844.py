import sys

n = int(sys.stdin.readline())
dp = [0] * 10
temp = [0] * 10

if n > 0:
    for i in range(1, 10):
        dp[i] = 1

temp = dp.copy()

for _ in range(1, n):
    dp[0] = temp[1]
    for i in range(1, 9):
        dp[i] = temp[i-1]+temp[i+1]
    dp[9] = temp[8]
    temp = dp.copy()

print(sum(dp) % 1000000000)
