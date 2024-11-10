import java.io.*;

public class Main9095 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 읽기 위한 BufferedReader 생성
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 쓰기 위한 BufferedWriter 생성
    
    int T = Integer.parseInt(br.readLine());
    
    int[] n = new int[T];
    for(int i = 0; i < T; i++) {
        n[i] = Integer.parseInt(br.readLine());
    }
    
    int[] dp = new int[12];
    
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    
    for(int i = 4; i<= 11; i++) {
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
    }
    
    for(int i = 0; i< T; i++) {
        bw.write(dp[n[i]]+"\n");
    }
    
    br.close(); // BufferedReader 닫기
    bw.flush(); // 출력 버퍼 비우기
    bw.close(); // BufferedWriter 닫기
  }
}