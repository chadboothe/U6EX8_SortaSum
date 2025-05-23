package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void sortaSum_One() {
        assertEquals(7, Main.sortaSum(3,4));

    }

    @Test
    void sortaSum_Two() {
        assertEquals(20, Main.sortaSum(9,4));
    }

    @Test
    void sortaSum_Three() {
        assertEquals(21, Main.sortaSum(10,11));
    }

}
