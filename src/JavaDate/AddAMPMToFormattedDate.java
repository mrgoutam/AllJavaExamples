/*
 Add AM/PM to time using SimpleDateFormat
 This example shows how to format time to have a AM/PM text using Java
 SimpleDateFormat class.  
 */
package JavaDate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Goutam
 */
public class AddAMPMToFormattedDate {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat sdf4 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd:MM:yyyy hh:mm:ss a");

        System.out.println("Time with AM/PM field: " + sdf1.format(date));
        System.out.println("Time with AM/PM field: " + sdf2.format(date));
        System.out.println("Time with AM/PM field: " + sdf3.format(date));
        System.out.println("Time with AM/PM field: " + sdf4.format(date));
        System.out.println("Time with AM/PM field: " + sdf5.format(date));

    }
}
