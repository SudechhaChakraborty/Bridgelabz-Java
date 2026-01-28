package javacollectionsandstreams;

import java.util.ArrayList;
import java.util.List;

// ---------- Category Classes ----------
class BookCategory {
    String name;

    BookCategory(String name) {
        this.name = name;
    }
}

class ClothingCategory {
    String name;

    ClothingCategory(String name) {
        this.name = name;
    }
}

class GadgetCategory {
    String name;

    GadgetCategory(String name) {
        this.name = name;
    }
}

// ---------- Generic Product Class ----------
class Product<T> {
    String productName;
    double price;
    T category;

    Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(productName + " | Price: ₹" + price);
    }
}

// ---------- Main Class ----------
public class ProductDemo {

    // Generic Method with Bounded Type
    static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.price * (percentage / 100);
        product.price -= discount;
    }

    public static void main(String[] args) {

        // Categories
        BookCategory bookCat = new BookCategory("Education");
        ClothingCategory clothingCat = new ClothingCategory("Fashion");
        GadgetCategory gadgetCat = new GadgetCategory("Electronics");

        // Products
        Product<BookCategory> book =
                new Product<>("Java Book", 500, bookCat);

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, clothingCat);

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 20000, gadgetCat);

        // Catalog (different product types together)
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("---- Before Discount ----");
        for (Product<?> p : catalog) {
            p.display();
        }

        // Apply discount
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        System.out.println("\n---- After Discount ----");
        for (Product<?> p : catalog) {
            p.display();
        }
    }
}
