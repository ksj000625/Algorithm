import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;           // 최대값 저장용
        int index = 0;         // 몇 번째 줄인지 저장

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();   // 입력 받기

            if (num > max) {
                max = num;
                index = i;           // 현재 줄 번호 저장
            }
        }

        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}