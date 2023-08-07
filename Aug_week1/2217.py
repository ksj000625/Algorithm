numRope = int(input())

maxW = []
for i in range(0, numRope):
    temp = int(input())
    maxW.append(temp)

maxW.sort()

weight = 0
answer = 0
for i in range(0, numRope):
    weight = maxW[i] * (numRope-i)
    if answer < weight:
        answer = weight

print(answer)