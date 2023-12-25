import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j1074 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int r = Integer.parseInt(temp[1]);
        int c = Integer.parseInt(temp[2]);

        int result = findValue(N, r, c);
        System.out.println(result);
    }

    public static int findValue(int N, int r, int c) {
        if (N == 0) {
            return 0;
        }

        int size = 1 << (N - 1); // 2^(N-1)

        if (r < size && c < size)
            return findValue(N - 1, r, c); // 좌상단
        else if (r < size && c >= size)
            return size * size + findValue(N - 1, r, c - size); // 우상단
        else if (r >= size && c < size)
            return 2 * size * size + findValue(N - 1, r - size, c); // 좌하단
        else
            return 3 * size * size + findValue(N - 1, r - size, c - size); // 우하단
    }
}
