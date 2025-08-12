package kyu7.troll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrollVowelsKataTest {

    @Test
    void disemvowel() {
        assertEquals("Ths wbst s fr lsrs LL!",TrollVowelsKata.disemvowel("This website is for losers LOL!")
        );
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", TrollVowelsKata.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals( "Wht r y,  cmmnst?", TrollVowelsKata.disemvowel("What are you, a communist?"));

    }
}