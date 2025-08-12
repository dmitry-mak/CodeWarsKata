package kyu8.numberToString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringKataTest {

    @Test
    void numberToString() {
        assertEquals("67", NumberToStringKata.numberToString(67));
        assertEquals("123", NumberToStringKata.numberToString(123));
        assertEquals("999", NumberToStringKata.numberToString(999));

    }
}