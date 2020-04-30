package org.iantorno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClassTest {

    @Test
    void addTwoNumbers() {
        Assertions.assertEquals(3, TestClass.addTwoNumbers(1, 2));
    }

    @Test
    void subtractTwoNumbers() {
        Assertions.assertEquals(3, TestClass.subtractTwoNumbers(5, 2));
    }
}