package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SyndromeServiceTest {

    @Test
    void findMax() {
        SyndromeService service = new SyndromeService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findMaxFullCoverage() {
        SyndromeService service = new SyndromeService();

        long[] incomesInBillions = {2, 6, 4, 8, 11, 9, 7, 5, 10, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
}