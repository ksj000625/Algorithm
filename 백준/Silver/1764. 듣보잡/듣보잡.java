import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        List<String> dontListen = new ArrayList<>();
        Set<String> dontSee = new HashSet<>();
        Set<String> both = new TreeSet<>(); // 자동 정렬을 위해 TreeSet 사용

        for (int i = 0; i < n; i++) {
            dontListen.add(scan.nextLine());
        }
        for (int i = 0; i < m; i++) {
            dontSee.add(scan.nextLine());
        }

        for (String name : dontListen) {
            if (dontSee.contains(name)) {
                both.add(name);
            }
        }

        System.out.println(both.size());
        for (String name : both) {
            System.out.println(name);
        }
    }
}
