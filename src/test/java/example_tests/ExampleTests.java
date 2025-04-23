package example_tests;

import static org.junit.jupiter.api.Assertions.*;

import example.Example;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class ExampleTests {
    // Basic Test
    @Test
    void basicTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }

    @Test
    @DisplayName(value = "Sjyst namn")
    void displayNameTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }


    // BeforeEach
    @BeforeEach
    void beforeEachTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }
    // AfterEach
    @AfterEach
    void afterEachTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }
    // Timeout
    @Test
    @Timeout(1)
    void TimeoutTest() throws InterruptedException {
        Thread.sleep(900);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void secondTimeOutTest() throws InterruptedException {
        Thread.sleep(900);
    }


    // After-All
    @AfterAll
    static void AfterAllTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }
    // BeforeAll
    @BeforeAll
    static void BeforeAllTest() {
        Example example = new Example();
        example.myInt = 1;
        assertEquals(1, example.myInt);
    }


}
