import java.io.*;

public class Main1094 {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 읽기 위한 BufferedReader 생성
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 쓰기 위한 BufferedWriter 생성
    
    int X;
    int result = 0;
    X = Integer.parseInt(br.readLine());
    
    for(int i = 8; i >= 0; i--) {
        int temp = (int) Math.pow(2, i);
        if(X >= temp) {
            result++;
            X -= temp;
        }
        
        if(X == 0) break;
    }
    
    bw.write(result+"\n");
    
    br.close(); // BufferedReader 닫기
    bw.flush(); // 출력 버퍼 비우기
    bw.close(); // BufferedWriter 닫기
  }
}