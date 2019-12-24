package dev.makhanov.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {

    @Test
    void testAdd() {
        int a = 1;
        int b = 1;
        int expectedRes = 2;
        Assertions.assertEquals(expectedRes, SomeLogic.addTwoNumber(a, b));
    }

}
