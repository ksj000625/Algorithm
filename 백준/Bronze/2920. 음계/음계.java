import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[8];
        
        for(int i = 0; i < 8; i++) {
            arr[i] = scan.nextInt();
        }
        
        String result = "mixed";
        
        if(arr[0] == 1) {
            // check ascending
            int i;
            for(i = 1; i < 8; i++) {
                if(arr[i - 1] != arr[i] - 1) {
                    break;
                }
            }
            if(i == 8) {
                result = "ascending";
            }
        } else if(arr[0] == 8) {
            // check descending
            int i;
            for(i = 1; i < 8; i++) {
                if(arr[i - 1] != arr[i] + 1) {
                    break;
                }
            }
            if(i == 8) {
                result = "descending";
            }
        }
        
        System.out.println(result);
        
        scan.close();
	}
}