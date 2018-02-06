/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * <p>
 * Represents a item which includes name, price and quantity. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Item {
    /** Item name. */
    private final String name;
    /** Item price. */
    private final double price;
    /** Item quantity. */
    private final int quantity;
    
    /**
     * Constructs a Item object by defining name, price and quantity.
     * @param name
     *            a string for item name
     * @param price
     *            a string for item price
     * @param quantity
     *            a string for item quantityC
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /**
     * Constructs a Item object by defining name and price.
     * @param name
     *            a string for item name
     * @param price
     *            a string for item price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    /**
     * Accessor for item name.
     * @return String as item name
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for item price.
     * @return String as item price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Accessor for item quantity.
     * @return String as item quantity
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Returns a String representation of this item.
     * @return String representation of this item.
     */
    public String toString() {
        return "The item name is " + name + ". " 
                + "The price is " + price + ". " 
                + "The quantity is " + quantity + ". ";
    }

}
