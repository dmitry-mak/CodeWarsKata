package kyu8.oddOrEven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void evenOrOdd() {

    }
    @Test @DisplayName("Should return \"Odd\" for num = 1")
    public void testPositiveOddNumbers() {
        assertEquals("Odd", Kata.evenOrOdd(1));
    }

    @Test @DisplayName("Should return \"Even\" for num = 2")
    public void testPositiveEvenNumbers() {
        assertEquals("Even", Kata.evenOrOdd(2));
    }

    @Test @DisplayName("Should return \"Odd\" for num = -1")
    public void testNegativeOddNumbers() {
        assertEquals("Odd", Kata.evenOrOdd(-1));
    }

    @Test @DisplayName("Should return \"Even\" for num = -2")
    public void testNegativeEvenNumbers() {
        assertEquals("Even", Kata.evenOrOdd(-2));
    }

    @Test @DisplayName("Should return \"Even\" for num = 0")
    public void testZero() {
        assertEquals("Even", Kata.evenOrOdd(0));
    }
}