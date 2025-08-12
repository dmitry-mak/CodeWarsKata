package kyu7.sumOfNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void getSum() {
    }

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.getSum(0, -1));
        assertEquals(1, s.getSum(0, 1));
    }

}