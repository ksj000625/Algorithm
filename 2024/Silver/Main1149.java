import java.util.Scanner;

public class Main1149 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[][] costs = new int[N][3];
       int[][] dp = new int[N][3];
       for(int i = 0 ; i < N ; i++){
           for(int j = 0 ; j < 3 ; j++){
               costs[i][j] = sc.nextInt();
           }
       }
       
       for(int i = 0 ; i < 3 ; i++){
           dp[0][i] = costs[0][i];
       }
       
       for(int i = 1 ; i < N ; i++){
           dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + costs[i][0];
           dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + costs[i][1];
           dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + costs[i][2];
       }
       
       System.out.println(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));

       sc.close();
    }

}