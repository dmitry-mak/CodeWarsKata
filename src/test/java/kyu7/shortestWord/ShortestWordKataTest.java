package kyu7.shortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordKataTest {

    @Test
    void findShort() {
        assertEquals(3, ShortestWordKata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWordKata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWordKata.findShort("Let's travel abroad shall we"));

    }
}