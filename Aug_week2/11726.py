import sys

num = int(sys.stdin.readline())

p = [0] * 1001

p[1] = 1
p[2] = 2

for i in range(3, num+1):
    p[i] = (p[i-1]+p[i-2]) % 10007

print(p[num])
