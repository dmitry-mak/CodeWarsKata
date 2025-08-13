package kyu6.arrayDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiffArrayTest {

    @Test
    void arrayDiff() {
        assertArrayEquals(new int[]{2}, DiffArray.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, DiffArray.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, DiffArray.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, DiffArray.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, DiffArray.arrayDiff(new int[]{}, new int[]{1, 2}));

    }
}