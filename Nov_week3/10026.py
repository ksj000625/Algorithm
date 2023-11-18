from collections import deque

n = int(input())
visited = [[False] * n for _ in range(n)]
graph = [list(map(str, input())) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
    queue = deque()
    queue.append([x, y])

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and not visited[nx][ny] and graph[nx][ny] == graph[x][y]:
                queue.append([nx, ny])
                visited[nx][ny] = True


count = 0

# 정상인 케이스
for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i, j)
            count += 1
print(count, end=' ')

# 색약자 케이스
for i in range(n):
    for j in range(n):
        if graph[i][j] == 'R':
            graph[i][j] = 'G'

visited = [[False] * n for _ in range(n)]  # 다시 초기화해주고 진행
count = 0

for i in range(n):
    for j in range(n):
        if not visited[i][j]:
            bfs(i, j)
            count += 1
print(count)