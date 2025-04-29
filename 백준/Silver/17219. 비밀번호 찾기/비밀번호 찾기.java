import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		//주소와 비밀번호가 전부 문자형태이기 때문에 String으로 받는다.
		HashMap<String, String> hm = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			hm.put(st.nextToken(), st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			sb.append(hm.get(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}

}