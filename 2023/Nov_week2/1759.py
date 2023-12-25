import sys


l, c = map(int, sys.stdin.readline().split())

alphabet = list(map(str, sys.stdin.readline().split()))
alphabet.sort()

arr=[]

def dfs():
    if len(arr)==l:
        if check(''.join(map(str,arr))):
            print(''.join(map(str,arr)))
            return
        else:
            return
    
    for i in alphabet:
        if i not in arr:
            if len(arr) != 0:
                if i > arr[-1]:
                    arr.append(i)
                    dfs()
                    arr.pop()
            else:
                arr.append(i)
                dfs()
                arr.pop()

def check(s):
    vowels = set('aeiou')
    vowel_count = 0
    consonant_count = 0

    for char in s:
        if char.lower() in vowels:
            vowel_count += 1
        else:
            consonant_count += 1

    # 영어 모음이 1개 이상이고 자음이 2개 이상인 경우 True 반환
    return vowel_count >= 1 and consonant_count >= 2

dfs()