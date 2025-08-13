package kyu6.persistentBurger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {

    @Test
    public void basicTest1() {
        assertEquals(3, Persist.persistence(39), "Incorrect answer for n=39");
    }

    @Test
    public void basicTest2() {
        assertEquals(0, Persist.persistence(4), "Incorrect answer for n=4");
    }

    @Test
    public void basicTest3() {
        assertEquals(2, Persist.persistence(25), "Incorrect answer for n=25");
    }

    @Test
    public void basicTest4() {
        assertEquals(4, Persist.persistence(999), "Incorrect answer for n=999");
    }
    @Test
    public void basicTest5() {
        assertEquals(2, Persist.persistence(483946), "Incorrect answer for n=999");
    }
}