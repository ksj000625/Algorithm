import sys

num = int(sys.stdin.readline())

house = [[0]*3]*num

for i in range(num):
    house[i] = list(map(int, sys.stdin.readline().rstrip().split()))

for i in range(1, num):
    house[i][0] = min(house[i-1][1], house[i-1][2])+house[i][0]
    house[i][1] = min(house[i-1][0], house[i-1][2])+house[i][1]
    house[i][2] = min(house[i-1][0], house[i-1][1])+house[i][2]


print(min(house[num-1]))
