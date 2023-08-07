# N개의 회의 입력받기
numMeeting = int(input())

if 1 > numMeeting & numMeeting > 100000:
    numMeeting = int(input())

# 각 0 ~ N-1번쨰까지의 회의의 시작시간과 끝나는 시간
time = [[0]*2 for _ in range(numMeeting)]

for i in range(0, numMeeting):
    tempS, tempE = map(int, input().split())
    time[i][0] = tempS
    time[i][1] = tempE

time.sort(key = lambda x: (x[1], x[0]))

count = 1
end_time = time[0][1]
for i in range(1, numMeeting):
    if time[i][0] >= end_time:
        count += 1
        end_time = time[i][1]

print(count)
