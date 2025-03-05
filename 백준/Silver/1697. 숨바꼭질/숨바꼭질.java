import java.util.*;

public class Main {
    static final int MAX = 100000;
    static boolean[] visited = new boolean[MAX + 1];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        scan.close();

        System.out.println(bfs(N, K));
    }

    static int bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int pos = current[0];
            int time = current[1];

            if (pos == target) return time;

            int[] nextPositions = {pos - 1, pos + 1, pos * 2};

            for (int next : nextPositions) {
                if (next >= 0 && next <= MAX && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, time + 1});
                }
            }
        }
        return -1;
    }
}
