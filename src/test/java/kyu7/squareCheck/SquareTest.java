package kyu7.squareCheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void isSquare() {
    }
    void shouldWorkForSomeExamples() throws Exception {
        assertEquals(false, Square.isSquare(-1));
        assertEquals(true,   Square.isSquare(0));
        assertEquals(false,  Square.isSquare(3));
        assertEquals(true,   Square.isSquare(4));
        assertEquals(true,   Square.isSquare(25));
        assertEquals(false,  Square.isSquare(26));
    }
}
