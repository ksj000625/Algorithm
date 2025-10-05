import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int combinations = 1;
            for (int cnt : map.values()) {
                combinations *= (cnt + 1);
            }

            // 아무 옷도 안 입는 경우를 제외
            combinations -= 1;

            sb.append(combinations).append("\n");
        }

        System.out.print(sb.toString());
    }
}
