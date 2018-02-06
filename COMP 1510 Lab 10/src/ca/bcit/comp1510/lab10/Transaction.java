/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Represents a transaction which includes an array for items. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Transaction {
    /** Holding an Item Array. */
    private Item[] cart;
    /** Holding the total price. */
    private double totalPrice;
    /** Holding the total number of items. */
    private int itemCount;
    
    /**
     * Constructs a Transaxtion object by defining how many items.
     * @param n
     *            a integer for how many items
     */
    public Transaction(int n) {
        cart = new Item[n];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    /**
     * Adds an item to the cart with its name, price and quantity.
     * @param name
     *            a string for item name
     * @param price
     *            a string for item price
     * @param quantity
     *            a string for item quantityC
     */
    public void addToCart(String name, double price, int quantity) {
        Item myItem = new Item(name, price, quantity);
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = myItem;
        totalPrice += price * quantity;
        itemCount++;
    }
    
    /**
     * Adds an item to the cart.
     * @param myItem
     *            a Item object
     */
    public void addToCart(Item myItem) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = myItem;
        totalPrice += myItem.getPrice() * myItem.getQuantity();
        itemCount++;
    }
    
    /**
     * Increases the size of the cart array.
     */
    public void increaseSize() {
        final int addItems = 3;
        Item[] temp = new Item[cart.length + addItems];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
    
    /**
     * Accessor for total price.
     * @return double as total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the total number of all items.
     * @return double as total number of all items
     */
    public double getCount() {
        double sum = 0;
        for (Item myItem: cart) {
            sum += myItem.getQuantity();
        }
        return sum;
    }
    
    /**
     * Returns a String representation of this transaction.
     * @return String representation of this transaction.
     */
    public String toString() {
        String result = "";
        for (Item myItem: cart) {
            if (myItem != null) {
                result += myItem.getName() + "\t" + myItem.getPrice() 
                + "\t" + myItem.getQuantity() + "\n";
            }
            
        }
        result += "The total price is: " + getTotalPrice();
        
        return result;
    }
    

}
