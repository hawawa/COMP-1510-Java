package ca.bcit.comp1510.lab12;


/**
 * Staff.
 *
 * @author BCIT
 * @author Chih-Hsi Chang
 * @version 2.0
 */
public class Staff {
    /** Staff size. */
    public static final int STAFF_SIZE = 8;
    /** Staff list. */
    private StaffMember[] staffList;

    /**
     * Constructor for objects of type Staff.
     */
    public Staff() {
        staffList = new StaffMember[STAFF_SIZE];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", 123456789, 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", 123456789, 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", 123456789, 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", 123456789, 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        staffList[6] = new Commission("C1", "Address1", "number1", 123456789, 10, 0.2);
        staffList[7] = new Commission("C2", "Address2", "number2", 123456789, 30, 0.05);
        
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Hourly) staffList[6]).addHours(35);
        ((Hourly) staffList[7]).addHours(20);
        ((Commission) staffList[6]).addSales(500);
        ((Commission) staffList[7]).addSales(2000);

        }

    /**
     * Pays staff members.
     */
    public void payday() {
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            double amount = staffList[count].pay(); // polymorphic
            System.out.println(staffList[count] + " Paid: " + amount);
        }
    }
}
