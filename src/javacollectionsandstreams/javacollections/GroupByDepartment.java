package javacollectionsandstreams.javacollections;

import java.util.*;

public class GroupByDepartment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> map = new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and department: ");
            String name = sc.next();
            String dept = sc.next();

            map.computeIfAbsent(dept, k -> new ArrayList<>())
                    .add(name);
        }

        System.out.println("Employees grouped by department:");
        System.out.println(map);
    }
}
