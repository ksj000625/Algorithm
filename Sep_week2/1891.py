import sys


        #  세시  세끝 가시 가끝  카운트
def findPos(n1, n2, m1, m2, idx):
    if idx == len(number):
        return n1, m1
    
    if number[idx] == '1':
        return findPos(n1, (n1+n2)//2, (m1+m2)//2, m2, idx+1)
    elif number[idx] == '2':
        return findPos(n1, (n1+n2)//2, m1, (m1+m2)//2, idx+1)
    elif number[idx] == '3':
        return findPos((n1+n2)//2, n2, m1, (m1+m2)//2, idx+1)
    elif number[idx] == '4':
        return findPos((n1+n2)//2, n2, (m1+m2)//2, m2, idx+1)
    

def check(n1, n2, m1, m2):
    global answer
    if len(answer) == d:
        return answer

    if n1 <= nx < (n1+n2)//2 and (m1+m2)//2 <= ny < m2:
        answer += '1'
        return check(n1, (n1 + n2) // 2, (m1 + m2) // 2, m2)

    elif n1 <= nx < (n1+n2)//2 and m1 <= ny < (m1+m2)//2:
        answer += '2'
        return check(n1, (n1 + n2) // 2, m1, (m1 + m2) // 2)

    elif (n1+n2)//2 <= nx < n2 and m1 <= ny < (m1+m2)//2:
        answer += '3'
        return check((n1 + n2) // 2, n2, m1, (m1 + m2) // 2)

    elif (n1+n2)//2 <= nx < n2 and (m1+m2)//2 <= ny < m2:
        answer += '4'
        return check((n1 + n2) // 2, n2, (m1 + m2) // 2, m2)



d, number = map(str, sys.stdin.readline().split())
d = int(d)
x, y = map(int, sys.stdin.readline().split())

n, m = 2**d, 2**d               # 최대 좌표 길이

dx, dy = findPos(0, n, 0, m, 0) # 사분면 조각의 좌표
nx, ny = (-1*y) + dx, x + dy    # 이동한 사분면 조각의 좌표
answer = ''

if 0 <= nx < n and 0 <= ny < m:
    print(int(check(0, n, 0, m)))
else:
    print(-1)