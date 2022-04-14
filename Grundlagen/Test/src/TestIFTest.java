import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class TestIFTest {
     Test t;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        t = new Test();
    }

    @org.junit.jupiter.api.Test
    @RepeatedTest(3)
    @DisplayName("Die Summe zweier Zahlen soll getestet werden.")
    void test_sum_of_a_and_b() {
        assertEquals(3,t.sum(1,2));
    }

    @org.junit.jupiter.api.Test
    void diff() {
    }
}