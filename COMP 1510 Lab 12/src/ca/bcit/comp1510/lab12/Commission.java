/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * <p>
 * Represents a commission job which includes total sales and commission rate.
 * Extends Shape. 
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Commission extends Hourly {
    /** Total sales. */
    private double totalSales;
    /** commission rate. */
    private double commissionRate;
    
    /**
     * Constructs a commission job by defining its state.
     * @param name
     *            a String for name
     * @param address
     *            a String for address
     * @param phone
     *            a String for phone number
     * @param sinNumber
     *            a integer for sin number
     * @param rate
     *            a double for rate
     * @param commissionRate
     *            a double for commission rate
     */  
    public Commission(String name, String address, String phone,
            int sinNumber, double rate, double commissionRate) {
        super(name, address, phone, sinNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    /**
     * Adds the total sales for the commission.
     * 
     * @param sales 
     *          a double for total sales
     */
    public void addSales(double sales) {
        this.totalSales += sales;
    }
    
    /**
     * Computes and returns the pay for this commission employee.
     * 
     * @return payment as a double
     */
    public double pay() {
        double payment = super.pay() + commissionRate * totalSales;
        totalSales = 0;
        return payment;
    }
    
    /**
     * Returns a String representation of this commission Employee.
     * @return string representation of this commission Employee.
     */
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
    
    


    

}
