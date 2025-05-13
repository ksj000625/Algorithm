import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int zeroCount = 0; // '0' 그룹의 개수
        int oneCount = 0;  // '1' 그룹의 개수
        
        // 첫 번째 문자에 따라 첫 그룹을 추가
        if (s.charAt(0) == '0') {
            zeroCount++;
        } else {
            oneCount++;
        }
        
        // 연속된 숫자가 변경될 때마다 그룹 개수 증가
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }
        
        // 최소 횟수를 출력
        System.out.println(Math.min(zeroCount, oneCount));
		
		scan.close();
	}

}