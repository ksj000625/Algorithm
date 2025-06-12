import java.util.*;

public class Main {
    static class Person {
        String name;
        int day, month, year;

        Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            list.add(new Person(name, day, month, year));
        }

        list.sort((a, b) -> {
            if (a.year != b.year) return b.year - a.year;
            if (a.month != b.month) return b.month - a.month;
            return b.day - a.day;
        });

        System.out.println(list.get(0).name);
        System.out.println(list.get(n - 1).name);
    }
}
