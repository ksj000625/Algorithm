import sys

n = int(sys.stdin.readline())

cost = list(map(int, sys.stdin.readline().split()))
cost.insert(0, 0)

dp = [0] * (n+1)

for i in range(1, n+1):
    for k in range(1, i+1):
        dp[i] = max(dp[i], dp[i-k] + cost[k])
print(dp[i])
