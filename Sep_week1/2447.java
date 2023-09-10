import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] square = {{'*','*','*'},{'*',' ', '*'},{'*','*','*'}};
			
		int max = Integer.parseInt(br.readLine());	

		char[][] shape = build(square, 3, max);

		for(int i = 0; i < shape.length; i++) {
            bw.write(shape[i]);
			bw.write("\n");
        }
		bw.flush();
		bw.close();

	}

	public static char[][] build(char[][] square, int n, int max) {
		if (max == 3)
			return square;

		char[][] shape = new char[n*3][n*3];
		// 세로
		for(int i  = 0; i < shape.length; i++) {
			// 가로
			for(int j = 0; j < shape[i].length; j++) {
				if(i >= n && i < n*2 && j >= n && j < n*2)
					shape[i][j] = ' ';
				else
					shape[i][j] = square[i%n][j%n];
			}
		}
		if(n*3 < max) {
			shape = build(shape, n*3, max);
		}
		return shape;
	}
}