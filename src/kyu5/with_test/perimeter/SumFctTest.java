package kyu5.with_test.perimeter;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class SumFctTest {
    @Test
    void testFib(){
        assertEquals(BigInteger.valueOf(216), SumFct.fibonacci(BigInteger.valueOf(7)));
    }

}