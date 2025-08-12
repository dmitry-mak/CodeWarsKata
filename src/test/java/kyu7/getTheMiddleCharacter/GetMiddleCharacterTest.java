package kyu7.getTheMiddleCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMiddleCharacterTest {

    @Test
    void getMiddle() {
    }

    @Test
    public void evenTests() {
        assertEquals("es", GetMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetMiddleCharacter.getMiddle("A"));
    }
}