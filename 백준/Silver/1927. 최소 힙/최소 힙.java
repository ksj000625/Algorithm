import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
        
        for(int i = 0; i < n; i++) {
            int temp = scan.nextInt();
            if(temp > 0) {
                minQueue.add(temp);
            } else {
                if(!minQueue.isEmpty()) {
                    System.out.println(minQueue.poll());
                } else {
                    System.out.println(0);
                }
            }
            
        }
        
        scan.close();
    }
}