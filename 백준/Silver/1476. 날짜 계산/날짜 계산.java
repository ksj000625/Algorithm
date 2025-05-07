import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int E = scan.nextInt();  
        int S = scan.nextInt();
        int M = scan.nextInt();
        
        int year = 0;
        while(true) {
            year++;
            if((year-E)%15==0 && (year-S)%28==0 && (year-M)%19==0){
                break;
            }
        }
        
        System.out.println(year);
        
        scan.close();
    }
}