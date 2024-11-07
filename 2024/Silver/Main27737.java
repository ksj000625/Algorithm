import java.util.Scanner;

public class Main27737 {

    static int [] dirX = {1,0,-1,0};
    static int [] dirY = {0,1,0,-1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //농장의 크기
        int N=sc.nextInt();
        //포자의 개수
        int M=sc.nextInt();

        //버섯포자가 심어진 칸을 포함해 버섯을 자라게 할 수 있는 칸의 최대 연결 회수
        int K=sc.nextInt();
        int [][]farm = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        double reqAmount=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                farm[i][j]=sc.nextInt();
            }
        }
        //농장을 탐색하면서 총 필요한 포자 수 구하기
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(farm[i][j]==0&& !visited[i][j]&&M>0){
                    int count = DFS(i,j,N,farm,visited);
                    reqAmount += Math.ceil((double) count / K);

                }
            }
        }
        //필요양이 포자개수보다 적다면, 가능. 아니라면 불가능
        if(reqAmount<=M && reqAmount>0){
            System.out.println("POSSIBLE");
            System.out.println(M-(int)reqAmount);
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }

    public static int DFS(int x,int y,int N,int[][] farm,boolean[][] visited){
        visited[x][y]=true;
        int count =1;
        //포자 심기가 가능한 땅 개수 구하기
        for(int i=0; i<4;i++){
            int nextX=x+dirX[i];
            int nextY=y+dirY[i];
            //만약 가려는 장소가 버섯을 심을 수  있고 방문하지 않았다면 방문한다.
            if(nextX>=0 && nextX<N && nextY>=0 && nextY<N && !visited[nextX][nextY] && farm[nextX][nextY]==0){
                count +=DFS(nextX,nextY,N,farm,visited);
            }
        }
        return count;

    }
}