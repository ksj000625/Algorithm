import java.util.*;
import java.io.*;

public class Main1010 {
    private final static int MAX = 30; // 조합 계산에서 사용할 최대 값 설정
    static int[][] dp = new int[MAX + 1][MAX + 1]; // dp 배열로 조합 결과를 저장하는 배열 선언

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 읽기 위한 BufferedReader 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 쓰기 위한 BufferedWriter 생성

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        createCombie(); // 조합 계산을 미리 수행하여 dp 배열에 저장

        for (int i = 0; i < T; i++) { // 테스트 케이스 수만큼 반복
            StringTokenizer st = new StringTokenizer(br.readLine()); // 각 테스트 케이스 입력 받기

            int r = Integer.parseInt(st.nextToken()); // r 값 입력
            int n = Integer.parseInt(st.nextToken()); // n 값 입력

            bw.write(dp[n][r] + "\n"); // 미리 계산한 dp[n][r] 값 출력
        }

        br.close(); // BufferedReader 닫기
        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
    }

    static void createCombie() {
        for (int i = 1; i <= MAX; i++) {
            dp[i][1] = i; // nC1 값은 항상 n이므로 dp 배열 초기화
        }

        for (int j = 2; j <= MAX; j++) { // dp 배열을 활용하여 조합 값 계산
            for (int k = 2; k <= MAX; k++) {
                dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k]; // nCr = (n-1)C(r-1) + (n-1)Cr 이용하여 dp 계산
            }
        }
    }
}
