package kyu7.descendingOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderKataTest {

    @Test
    void sortDesc() {
        assertEquals(0, DescendingOrderKata.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrderKata.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrderKata.sortDesc(123456789));

    }
}