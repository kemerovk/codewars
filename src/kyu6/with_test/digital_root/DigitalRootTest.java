package kyu6.with_test.digital_root;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    @Test
    void test(){
        assertEquals(6, DigitalRoot.digital_root(456));
    }
}