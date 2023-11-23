import sys


n, m = map(int, sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

start = 0
end = max(tree)

while start <= end:
    mid = (start + end)//2
    count = 0
    for temp in tree:
        if temp > mid:
            count += temp - mid
            if count > m:
                break
    

    if count >= m:
        start = mid + 1
    else:
        end = mid - 1

print(end)