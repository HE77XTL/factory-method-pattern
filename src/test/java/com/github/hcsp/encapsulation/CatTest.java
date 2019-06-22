package com.github.hcsp.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void createValidCat() {
        Cat cat = Cat.newCat("ABC", 0);
        Assertions.assertEquals("ABC", cat.getName());
        Assertions.assertEquals(0, cat.getAge());
    }

    @Test
    public void createInvalidCat() {
        Cat cat1 = Cat.newCat(null, -1);
        Cat cat2 = Cat.newCat("", -1);
        Cat cat3 = Cat.newCat("", 1);
        Assertions.assertTrue(cat1 == cat2);
        Assertions.assertTrue(cat3 == cat2);
        Assertions.assertEqials("Invalid cat", cat1.getName());
    }
}
