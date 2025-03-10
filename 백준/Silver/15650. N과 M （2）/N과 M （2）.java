import java.util.Scanner;
 
public class Main {
	public static int[] arr;
	public static int n, m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
 
	    n = scan.nextInt();
	    m = scan.nextInt();
 
	    arr = new int[m];

	    dfs(1, 0);
	    System.out.print(sb);

        scan.close();
	}
 
	public static void dfs(int at, int depth) {
	    if (depth == m) {
	        for (int val : arr) {
	        	sb.append(val).append(' ');
	        }
	        sb.append('\n');
	        return;
	    }

	    for (int i = at; i <= n; i++) {
    		arr[depth] = i;
    		dfs(i + 1, depth + 1);
    	}
	}
}