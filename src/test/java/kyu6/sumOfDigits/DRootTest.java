package kyu6.sumOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {

//    @Test
//    void digital_root() {
//    }

    @Test
    public void Test1() {
        assertEquals(  7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals(  6, DRoot.digital_root(456));
    }

    @Test
    public void TestGpt() {
        assertEquals(  7, DRoot.digitalRootFromGpt(16));
        assertEquals(  6, DRoot.digitalRootFromGpt(456));

    }

}