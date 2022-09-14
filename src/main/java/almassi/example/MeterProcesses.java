package almassi.example;
import java.util.Scanner;

/**
 * Almass Koraishi
 * CIS175 Week 2 Assignment
 * Sep 14, 2022
 */

public class MeterProcesses {

    public static String getHouseNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter house number: ");
        return input.nextLine();
    }

    public static int getMeterNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter meter number: ");
        return input.nextInt();
    }

    public static int getPreviousReading() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter previous reading: ");
        return input.nextInt();
    }

    public static int getCurrentReading() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current reading: ");
        return input.nextInt();
    }

    public static int calculateUnitsUsed (int current_reading, int previous_reading) {
        return current_reading - previous_reading;
    }

    public static float getTotalPrice(int units_used, int unit_cost) {
        return units_used * unit_cost;
    }

    public static void generateReport(String house_num,
                                      int meter_num,
                                      int previous_reading,
                                      int current_reading,
                                      int unit_cost) {
        int units_used = current_reading - previous_reading;
        int total_price = unit_cost * units_used;

//       Generate Report
        System.out.println("\n Bill Summary");
        System.out.println("House Number: " + house_num);
        System.out.println("Meter Number: " + meter_num);
        System.out.println("Previous Reading: " + previous_reading);
        System.out.println("Current Reading: " + current_reading);
        System.out.println("Units Consumed: " + units_used);
        System.out.println("Unit Cost: " + unit_cost);
        System.out.println("Total Usage: " + total_price);
    }
}
