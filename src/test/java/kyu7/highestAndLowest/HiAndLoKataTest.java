package kyu7.highestAndLowest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HiAndLoKataTest {

    @Test
    void highAndLow() {


        assertEquals("42 -9", HiAndLoKata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("3 1", HiAndLoKata.highAndLow("1 2 3"));

    }
}