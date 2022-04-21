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

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        assertEquals(4,list.size(),"The size of the list is not 2!!");
    }

    @Test
    void test_output_sequence() {
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        assertEquals(10,list.size(),"The size of the list is not ten!!");
        assertEquals(0,list.remove(),"The correct number was not returned!!");
        assertEquals(1,list.remove(),"The correct number was not returned!!");
        assertEquals(2,list.remove(),"The correct number was not returned!!");
        assertEquals(3,list.remove(),"The correct number was not returned!!");
        assertEquals(4,list.remove(),"The correct number was not returned!!");
        assertEquals(5,list.remove(),"The correct number was not returned!!");
        assertEquals(6,list.remove(),"The correct number was not returned!!");
        assertEquals(7,list.remove(),"The correct number was not returned!!");

        for(int i = 0; i < 10; i++){
            //assertEquals(i,list.remove(),"The correct number was not returned!!");
        }

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