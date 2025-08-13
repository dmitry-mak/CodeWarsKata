package kyu6.createPhoneNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    void createPhoneNumber() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    void createPhoneNumberUpdated() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumberUpdated(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}