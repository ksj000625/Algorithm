import sys


n = int(sys.stdin.readline())   # 컴퓨터 수
m = int(sys.stdin.readline())   # 쌍의 수

arr = [[0] * 2] * (m+1)         # 번호 쌍

count = 0

for i in range(1, m+1):
    arr[i] = list(map(int, sys.stdin.readline().split()))

visited = [False] * (n+1)


def dfs(start_node):
    stack = [start_node, ]
    visited[start_node] = True
    

    while len(stack) != 0:

        cn = stack.pop()

        for i in range(0, m+1):
            if arr[i][0] == cn:
                if not visited[arr[i][1]]:
                    stack.append(arr[i][1])
                    visited[arr[i][1]] = True
            elif arr[i][1] == cn:
                if not visited[arr[i][0]]:
                    stack.append(arr[i][0])
                    visited[arr[i][0]] = True
        
dfs(1)

for i in range(0, n+1):
    if visited[i]:
        count += 1

print(count-1)
