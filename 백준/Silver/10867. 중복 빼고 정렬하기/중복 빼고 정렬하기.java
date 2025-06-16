import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        Collections.sort(list);
        
        for(int num: list) {
            System.out.print(num + " ");
        }
        
        scan.close();
    }
}