public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Peanut Butter", 3.50));
        cart.addItem(new Item("Jelly", 3.00));
        cart.addItem(new Item("Bread", 5.00));
        cart.addItem(new Item("Honey", 3.25));

        System.out.println("Items in the cart before removal:");
        cart.displayItems();

        Item honey = new Item("Honey", 5.50);
        cart.removeItem(honey);

        System.out.println("\nItems in the cart after removing Honey:");
        cart.displayItems();

        // Display total price and number of items
        System.out.println("\nTotal Price: $" + cart.getTotalPrice());
        System.out.println("Number of Items: " + cart.getNumberOfItems());
    }
}

