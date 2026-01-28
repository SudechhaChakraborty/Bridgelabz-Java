package javacollectionsandstreams.javacollections;



import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ HashMap → Candidate -> Votes
        Map<String, Integer> voteCount = new HashMap<>();

        // 2️⃣ LinkedHashMap → Order of votes
        Map<Integer, String> voteOrder = new LinkedHashMap<>();

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();

        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter candidate name for vote " + i + ": ");
            String candidate = sc.nextLine();

            // store vote count
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

            // store voting order
            voteOrder.put(i, candidate);
        }

        // Display votes in insertion order
        System.out.println("\n--- Vote Order (LinkedHashMap) ---");
        for (Map.Entry<Integer, String> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getKey() + " -> " + entry.getValue());
        }

        // Display raw vote count
        System.out.println("\n--- Vote Count (HashMap) ---");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 3️⃣ TreeMap → Sorted Results
        Map<String, Integer> sortedResults = new TreeMap<>(voteCount);

        System.out.println("\n--- Final Results (Sorted - TreeMap) ---");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
