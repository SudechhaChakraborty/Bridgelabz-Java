package javacollectionsandstreams;

import java.util.ArrayList;
import java.util.List;

// ---------- Abstract Class ----------
public abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}

// ---------- Electronics ----------
class Electronics extends WarehouseItem {

    Electronics(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Electronics Item: " + name);
    }
}

// ---------- Groceries ----------
class Groceries extends WarehouseItem {

    Groceries(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Grocery Item: " + name);
    }
}

// ---------- Furniture ----------
class Furniture extends WarehouseItem {

    Furniture(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Furniture Item: " + name);
    }
}

// ---------- Generic Storage ----------
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}

// ---------- Main Class ----------
class SmartWarehouse {

    // Wildcard method
    static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("---- Electronics ----");
        displayAllItems(electronicsStorage.getItems());

        System.out.println("---- Groceries ----");
        displayAllItems(groceryStorage.getItems());

        System.out.println("---- Furniture ----");
        displayAllItems(furnitureStorage.getItems());
    }
}
