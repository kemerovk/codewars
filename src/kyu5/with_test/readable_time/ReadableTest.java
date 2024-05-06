package kyu5.with_test.readable_time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadableTest {

    @Test
    void makeReadableTest(){
        assertEquals("00:01:05", HumanReadable.makeReadable(65));
    }
}