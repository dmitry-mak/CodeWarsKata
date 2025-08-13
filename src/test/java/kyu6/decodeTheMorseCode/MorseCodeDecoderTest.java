package kyu6.decodeTheMorseCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."),("HEY JUDE"));
    }

}