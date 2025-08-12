package kyu8.yesOrNo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {

    @Test
    void boolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}