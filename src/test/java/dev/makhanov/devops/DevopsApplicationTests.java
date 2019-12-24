package dev.makhanov.devops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {

    @Test
    void testAdd() {
        Assertions.assertEquals(2, 2);
    }

}
