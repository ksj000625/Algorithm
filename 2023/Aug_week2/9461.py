import sys

numTest = int(sys.stdin.readline())

tIndex = []

for _ in range(0, numTest):
    temp = int(sys.stdin.readline())
    tIndex.append(temp)

# -------------------------------------

seq = []    # 수열 저장
seq.append(1)  # 시작점

for i in range(1, max(tIndex)):
    if i < 5:
        # 6번쨰 삼각형 이전
        if i % 2 == 0:
            # 홀수 번째일 경우
            seq.append(seq[i-1])
        else:
            # 짝수 번째의 경우
            if i-2 < 0:
                # 2번째의 경우
                seq.append(seq[i-1])
            else:
                # 4번째의 경우
                seq.append(seq[i-1]+seq[i-3])
    else:
        # 6번째 삼각형부터
        seq.append(seq[i-1]+seq[i-5])

for i in tIndex:
    print(seq[i-1])
