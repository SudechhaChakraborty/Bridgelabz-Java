package javacollectionsandstreams.javacollections;


import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // HashMap → product -> price
        Map<String, Integer> priceMap = new HashMap<>();

        // LinkedHashMap → order of items added
        Map<String, Integer> cartOrder = new LinkedHashMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter product price: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume newline

            // store price
            priceMap.put(product, price);

            // store cart order
            cartOrder.put(product, price);
        }

        // Display items in order added
        System.out.println("\n--- Cart Items (Insertion Order - LinkedHashMap) ---");
        for (Map.Entry<String, Integer> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }

        // TreeMap → sort by price
        TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
            sortedByPrice
                    .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                    .add(entry.getKey());
        }

        System.out.println("\n--- Items Sorted by Price (TreeMap) ---");
        for (Map.Entry<Integer, List<String>> entry : sortedByPrice.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " : ₹" + entry.getKey());
            }
        }
    }
}
