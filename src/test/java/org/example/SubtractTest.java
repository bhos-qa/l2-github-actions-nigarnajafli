package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SubtractTest {
    @Test
    void testSubtract() {
        int num1 = 70;
        int num2 = 20;
        assertEquals(50, Main.subtract(num1, num2));
    }
}
