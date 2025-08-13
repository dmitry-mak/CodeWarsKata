package kyu6.whoiLikesIt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest {

    @Test
    void whoLikesIt() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));

    }

    @Test
    void whoLikesItWithSwitch() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesItWithSwitch());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesItWithSwitch("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesItWithSwitch("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesItWithSwitch("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesItWithSwitch("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    void whoLikesItWithStream() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesItWithStream());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesItWithStream("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesItWithStream("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesItWithStream("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesItWithStream("Alex", "Jacob", "Mark", "Max"));
    }
}