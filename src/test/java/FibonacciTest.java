package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void testFibonacci() {
        Fibonacci fib = new Fibonacci();
        assertEquals("0 1 1 2 3 5 8", fib.generate(7));
    }
}