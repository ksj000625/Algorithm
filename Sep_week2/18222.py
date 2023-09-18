import sys


def findValue(n):
    if n == 0:
        # t0 = 0
        return 0
    elif n == 1:
        # t1 = 1
        return 1
    if n%2:
        #t2n+1 = 1-tn
        return 1 - findValue(n//2)
    else:
        #t2n = tn
        return findValue(n//2)

k = int(sys.stdin.readline())

print(findValue(k-1))
