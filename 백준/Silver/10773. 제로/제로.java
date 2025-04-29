import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int k = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < k; i++) {
            int temp = scan.nextInt();
            
            if(temp == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(temp);
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        
        scan.close();
    }
}