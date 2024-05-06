package kyu5.with_test.non_repeating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharTest {

    @Test
    void test(){
        assertEquals("", Char.firstNonRepeatingLetter("moonmoon"));
    }
}