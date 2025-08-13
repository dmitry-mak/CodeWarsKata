package kyu6.multiplesOf3and5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    void solution() {
        assertEquals(23, new Multiplier().solution(10));
    }
}