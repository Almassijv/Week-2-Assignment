/**
 * Almass Koraishi
 * CIS175 Week 2 Assignment
 * Sep 14, 2022
 */

package almassi.example;

public class Meter{
    private int meter_num;
    private int previous_reading;
    private int current_reading;
    private String house_num;
    private int unit_cost;

    public Meter (String house_num, int meter_num, int previous_reading, int current_reading) {
        this.meter_num = meter_num;
        this.previous_reading = previous_reading;
        this.current_reading = current_reading;
        this.house_num = house_num;
        this.unit_cost = 2;
    }

    public int getMeter_num() {
        return meter_num;
    }

    public void setMeter_num(int meter_num) {
        this.meter_num = meter_num;
    }

    public int getPrevious_reading() {
        return previous_reading;
    }

    public void setPrevious_reading(int previous_reading) {
        this.previous_reading = previous_reading;
    }

    public int getCurrent_reading() {
        return current_reading;
    }

    public void setCurrent_reading(int current_reading) {
        this.current_reading = current_reading;
    }

    public String getHouse_num() {
        return house_num;
    }

    public void setHouse_num(String house_num) {
        this.house_num = house_num;
    }

    public int getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(int unit_cost) {
        this.unit_cost = unit_cost;
    }
}

