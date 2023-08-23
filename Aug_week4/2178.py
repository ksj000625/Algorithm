import sys
from collections import deque

n, m = map(int, sys.stdin.readline().split())

graph = [[0] * m] * n
count = 1


for i in range(0, n):
    graph[i] = list(map(int, input().rstrip()))

    # 좌  우  하  상
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):

    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                queue.append((nx, ny))
                graph[nx][ny] = graph[x][y] + 1

    return graph[n-1][m-1]


print(bfs(0, 0))
