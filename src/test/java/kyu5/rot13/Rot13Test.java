package kyu5.rot13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rot13Test {
    @Test
    void test() {
        assertEquals("grfg", Rot13.rot13("test"));
        assertEquals("Grfg", Rot13.rot13("Test"));
    }

    @Test
    void test2() {
        assertEquals("Ehol vf pbby!", Rot13.rot13("Ruby is cool!"));
    }

    @Test
    void test3() {
        assertEquals("NY/Iw)wT1", Rot13.rot13("AL/Vj)jG1"));
    }

}