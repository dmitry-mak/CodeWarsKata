package kyu8.removeChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharsKataTest {

    @Test
    void remove() {
        assertEquals("loquen", RemoveCharsKata.remove("eloquent"));
        assertEquals("ountr", RemoveCharsKata.remove("country"));
        assertEquals("erso", RemoveCharsKata.remove("person"));
        assertEquals("lac", RemoveCharsKata.remove("place"));
    }
}