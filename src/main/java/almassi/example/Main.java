package almassi.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Meter m1 = new Meter(
                MeterProcesses.getHouseNum(),
                MeterProcesses.getMeterNum(),
                MeterProcesses.getPreviousReading(),
                MeterProcesses.getCurrentReading()
        );

        MeterProcesses.generateReport(
                m1.getHouse_num(),
                m1.getMeter_num(),
                m1.getPrevious_reading(),
                m1.getCurrent_reading(),
                m1.getUnit_cost()
        );
    }
}