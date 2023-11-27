import sys


n = int(sys.stdin.readline())
line = []

dp = [1]*n

for i in range(n):
    line.append(list(map(int, sys.stdin.readline().split())))

line.sort()

for i in range(1, n):
    for j in range(0, i):
        if line[j][1] < line[i][1]:
            dp[i] = max(dp[i], dp[j]+1)
      
print(n-max(dp))