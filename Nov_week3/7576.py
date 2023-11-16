from collections import deque
import sys


m, n = map(int, sys.stdin.readline().split())

graph = []
initial = []

count = 0

for i in range(0, n):
    graph.append(list(map(int, sys.stdin.readline().split())))

    for j in range(0, m):
            if graph[i][j] == 1:
                initial.append([j, i])

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

if len(initial) > 0:
    firstQueue = initial[0]

def bfs():
    global count
    global firstQueue

    key = False
    queue = deque()

    for i in range(0, len(initial)):
        queue.append((initial[i][1], initial[i][0]))

    while queue:
        x, y = queue.popleft()

        # print("[", y, ",", x, "]")
        # print(firstQueue)

        if x == firstQueue[1] and y == firstQueue[0]:
            key = True
            count += 1
            # print("count ++")

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i] 

            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 0:
                queue.append((nx, ny))
                graph[nx][ny] = 1
                if key:
                    firstQueue = [ny, nx]
                    key = False
                # for i in range(0, len(graph)):
                #     print(graph[i])
                # print("--------------------")

    return graph

graph = bfs()
isZero = False
count -= 1

for i in range(0, n):
    if 0 in graph[i]:
        isZero = True
        break

if isZero:
    print(-1)
else:
    print(count)

# for i in range(0, len(graph)):
#      print(graph[i])