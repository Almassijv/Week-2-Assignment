package almassi.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeterProcessesTest {

    @Test
    void twoUnitsAtTwoUnitCostsEqualsFour() {
        assertEquals(4, MeterProcesses.getTotalPrice(2,2));
    }

    @Test
    void previousReadingOfFourAndCurrentReadingOfNineIsFiveUnits() {
        assertEquals(5, MeterProcesses.calculateUnitsUsed(9,4));
    }

    @Test
    void houseNumberIsNotEmpty() {

    }

    @Test
    void readingsAreNotEmpty() {
        assertNotNull(MeterProcesses.getHouseNum());
        assertTrue(MeterProcesses.getCurrentReading() > MeterProcesses.getPreviousReading());
    }
}