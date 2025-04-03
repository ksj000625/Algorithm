import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int[] sides = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
            
            // 종료 조건
            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break;
            }
            
            // 오름차순 정렬
            Arrays.sort(sides);

            // 피타고라스 정리 검사
            if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        
        scan.close();
    }
}
