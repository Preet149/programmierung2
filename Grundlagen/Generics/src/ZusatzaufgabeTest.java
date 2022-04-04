import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class ZusatzaufgabeTest {

    @Test
    void testsum() {
        assertEquals(23,Zusatzaufgabe.sum(10),"The sum is not correct!!");
    }

    @Test
    void testExceptionThrown(){
        assertThrows(IllegalArgumentException.class,()->Zusatzaufgabe.sum(-1),"Oops the illegalArgumentException was not thrown!");
    }
}