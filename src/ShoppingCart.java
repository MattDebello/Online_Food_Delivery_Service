import java.util.List;
import java.util.ArrayList;

class ShoppingCart implements Bag {
    List<Item> items;

    // Constructor
    ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Implement the Bag Interface methods
    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.price;
        }
        return totalPrice;
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.itemName + ", Price: $" + item.price);
        }
    }
}