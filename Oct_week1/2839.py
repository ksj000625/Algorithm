import sys


n  = int(sys.stdin.readline())
kg = [3, 5]

dp = [1667] * (n+1)
dp[0] = 0

for num in kg:
    for i in range(num, n+1):
        dp[i] = min(dp[i], dp[i-num]+1)
    
if dp[n] == 1667:
    print(-1)
else:
    print(dp[n])