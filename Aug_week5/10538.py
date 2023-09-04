import sys


hp, wp, hm, wm = map(int, sys.stdin.readline().split())

arrP = [[0] * wp] * hp
arrM = [[0] * wm] * hm
dic = []


for i in range(0, hp):
    arrP[i] = list(map(str, input().rstrip()))

for i in range(0, hm):
    arrM[i] = list(map(str, input().rstrip()))

#---------------------------------------------------------

for i in range(0, hm-hp+1):
    for j in range(0, wm-wp+1):
        if arrP[0][0] == arrM[i][j]:
            dic.append([i, j])


answer = 0
temp = [[0] * wp] * hp
tmp = [0] * wp

for x in range(0, len(dic)):
    for i in range(0, hp):
        for j in range(0, wp):
            tmp[j] = arrM[dic[x][0]+i][dic[x][1]+j]
        temp[i] = tmp
        tmp = [0] * wp
    
    if arrP == temp:
        answer += 1

print(answer)