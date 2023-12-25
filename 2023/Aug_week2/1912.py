import sys

num = int(sys.stdin.readline())
numlist = list(map(int, sys.stdin.readline().split()))

for i in range(1, num):
    numlist[i] = max(numlist[i], numlist[i-1] + numlist[i])

print(max(numlist))
