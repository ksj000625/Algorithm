import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main1326 {
    // 개구리 클래스
    static class Frog{
        // 위치
        int pos;
        // 점프한 횟수
        int count;

        // 생성자
        public Frog(int pos, int count) {
            this.pos = pos;
            this.count = count;
        }
    }
    // 다리의 길이
    static int n;
    // 점프 할 값이 쓰여있는 징검다리 수
    static int[] bridge;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        // 징검다리 배열 초기화
        bridge = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            // 각 수 입력
            bridge[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        // 시작지점과 도착지점 입력 받음
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start, end));
    }

    private static int bfs(int start, int end) {
        // 방문 처리를 위한 배열 생성
        boolean[] visit = new boolean[n + 1];
        // 시작 지점 방문 처리
        visit[start] = true;
        // 각 개구리의 상태를 저장하기 위한 큐
        Queue<Frog> queue = new LinkedList<>();
        queue.offer(new Frog(start, 0));

        while (!queue.isEmpty()) {
            Frog cur = queue.poll();
            // 위치가 도착지점이라면 바로 리턴
            if(cur.pos == end){
                return cur.count;
            }
            // 현재 위치에서 주어지는 정수의 배수만큼 갈 수 있음
            int jump = bridge[cur.pos];

            // 뒤로 가는 경우
            for (int i = cur.pos; i >= 1; i -= jump) {
                // 방문한 곳이라면 continue;
                if (visit[i]) continue;
                // 방문 처리
                visit[i] = true;
                queue.offer(new Frog(i, cur.count + 1));
            }

            // 앞으로 가는 경우
            for (int i = cur.pos; i <= n; i += jump) {
                // 방문한 곳이라면 넘어간다.
                if(visit[i]) continue;
                visit[i] = true;
                queue.offer(new Frog(i, cur.count + 1));
            }
        }

        return -1;
    }
}