public class Main {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001]; // 1~10000까지 체크
        
        for (int i = 1; i <= 10000; i++) {
            int generated = d(i);
            if (generated <= 10000) {
                isNotSelfNumber[generated] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isNotSelfNumber[i]) { // 셀프 넘버인 경우 출력
                System.out.println(i);
            }
        }
    }

    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10; // 각 자리수 더하기
            n /= 10;
        }
        return sum;
    }
}
