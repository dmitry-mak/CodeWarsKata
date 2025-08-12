package kyu8.returnNegative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeNegativeKataTest {

    @Test
    public void makeNegative() {
        assertEquals(-42, MakeNegativeKata.makeNegative(42));
        assertEquals(0, MakeNegativeKata.makeNegative(0));
        assertEquals(-10, MakeNegativeKata.makeNegative(-10));
    }
}