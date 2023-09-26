import sys


n, k = map(int, sys.stdin.readline().split())

coin = [0] * n

for i in range(0, n):
    coin[i] = int(sys.stdin.readline())

coin.sort()

dp = [10001] * (k+1)
dp[0] = 0
count = 0

for num in coin:
    for i in range(num, k+1):
       print("dp[", i, "] : ", dp[i], " / dp[i-", num, "+1] : ", dp[i-num]+1)
       dp[i] = min(dp[i],dp[i-num]+1)

if dp[k] == 10001:
   print(-1)
else:
   print(dp[k])