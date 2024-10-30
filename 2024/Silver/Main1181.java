import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 읽기 위한 BufferedReader 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 쓰기 위한 BufferedWriter 생성

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator < String > () {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }

            }
        });

        for (int i = 0; i < num; i++) {
            if(i == 0) continue;
            if (!arr[i].equals(arr[i - 1])) {
                bw.write(arr[i] + "\n");
            }
        }

        br.close(); // BufferedReader 닫기
        bw.flush(); // 출력 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
    }
}