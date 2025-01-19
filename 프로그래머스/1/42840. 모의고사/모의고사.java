import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        // 각 수포자의 답안 패턴
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수 배열
        int[] scores = new int[3];

        // 각 학생의 정답 비교
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) scores[0]++;
            if (answers[i] == student2[i % student2.length]) scores[1]++;
            if (answers[i] == student3[i % student3.length]) scores[2]++;
        }

        // 가장 높은 점수 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 가장 높은 점수를 받은 학생들 찾기
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                resultList.add(i + 1); // 학생 번호는 1부터 시작
            }
        }

        // 결과를 배열로 변환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
