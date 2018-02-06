package q2;

import java.util.Scanner;

/**
 * <p>Converts seconds to hh:mm:ss.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //prompt and scan
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the "
                + "seconds which you want to convert:");
        int totalsecond = scan.nextInt();
        int restsecond;
        
        //hour
        int hour;
        final int hoursecond = 3600;
        hour = totalsecond / hoursecond;
        restsecond = totalsecond % hoursecond;
        
        //minute
        int minute;
        final int minutesecond = 60;
        minute = restsecond / minutesecond;
        restsecond = restsecond % minutesecond;
        
        //second
        int second;
        final int secondsecond = 1;
        second = restsecond / secondsecond;
        restsecond = restsecond % secondsecond;
        
        //print the result
        System.out.println("hh:mm:ss: " + hour + ":" + minute + ":" + second);
        
        //close scan object
        scan.close();
    }

};
