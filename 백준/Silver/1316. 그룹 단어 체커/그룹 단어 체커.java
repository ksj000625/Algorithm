import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어의 개수
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 방문 여부 저장
        char prev = 0; // 이전 문자 저장

        for (char c : word.toCharArray()) {
            if (prev != c) { // 이전 문자와 다를 때만 체크
                if (visited[c - 'a']) { // 이전에 등장한 문자라면 그룹 단어 아님
                    return false;
                }
                visited[c - 'a'] = true; // 방문 체크
            }
            prev = c; // 이전 문자 업데이트
        }
        return true;
    }
}
