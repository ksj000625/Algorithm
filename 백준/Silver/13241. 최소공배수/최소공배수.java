import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		if(a > b) {
		    System.out.println(a * b / findGCD(a, b));
		} else if(a < b) {
		    System.out.println(a * b / findGCD(b, a));
		} else {
		    System.out.println(a);
		}
		
		scan.close();
	}

    //최소 공배수 찾는 메서드
    static long findGCD(long a, long b){
        while(b != 0){
            long r = a % b; //나머지
            a = b; 
            b = r;
        }
        
        return a;
    }
}