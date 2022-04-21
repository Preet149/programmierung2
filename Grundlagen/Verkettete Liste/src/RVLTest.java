import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class RVLTest {
     RVL<Integer> list;

    @BeforeEach
    void setUp() {
        list = new RVL<>();
    }

    @Test
    @DisplayName("Checks whether the list is empty.")
    void test_is_list_empty() {
        assertTrue(list.isEmpty(),"The list is not empty!!");

        //Fuege ein Element in die Liste hinzu.
        list.add(2);
        assertFalse(list.isEmpty(),"The list is empty!!");
    }

    @Test
    void size() {
        //Die Liste ist leer.
        assertEquals(0,list.size(),"The size of the list is not zero!!");

    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void element() {
    }

    @Test
    void next() {
    }

    @Test
    void prev() {
    }
}