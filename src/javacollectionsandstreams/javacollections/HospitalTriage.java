package javacollectionsandstreams.javacollections;

import java.util.*;

public class HospitalTriage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> pq =
                new PriorityQueue<>((a, b) -> b.severity - a.severity);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and severity: ");
            pq.add(new Patient(sc.next(), sc.nextInt()));
        }

        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().name);
        }
    }
}
