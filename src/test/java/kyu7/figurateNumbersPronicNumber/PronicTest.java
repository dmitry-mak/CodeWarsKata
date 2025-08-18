package kyu7.figurateNumbersPronicNumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PronicTest {
    @Test
    @DisplayName("Test known pronic and non-pronic numbers")
    void isPronicTest() {
        assertTrue(Pronic.isPronic(0), "0 is a Pronic Number");
        assertFalse(Pronic.isPronic(1), "1 is not a Pronic Number");
        assertTrue(Pronic.isPronic(2), "2 is a Pronic Number");
        assertFalse(Pronic.isPronic(3), "3 is not a Pronic Number");
        assertFalse(Pronic.isPronic(4), "4 is not a Pronic Number");
        assertFalse(Pronic.isPronic(5), "5 is not a Pronic Number");
        assertTrue(Pronic.isPronic(6), "6 is a Pronic Number");
        assertFalse(Pronic.isPronic(-3), "-3 is not a Pronic Number");
        assertFalse(Pronic.isPronic(-27), "-27 is not a Pronic Number");
    }
}