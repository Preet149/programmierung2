import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class EVLTest {
     EVL<Integer>listinteger;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        listinteger = new EVL<>();
    }

    @org.junit.jupiter.api.Test
    void testgetFirst() {
        //The list is empty.
        assertThrows(NullPointerException.class,()->listinteger.getFirst(),"The List is empty!!");

        //Adding some elements into the list.
        for(int i = 0;i < 10;i++){
            listinteger.addLast(i);
        }
        assertEquals(0,listinteger.getFirst(),"The first element is wrong!!");
    }

    @org.junit.jupiter.api.Test
    void getLast() {
        //The list is empty.
        assertThrows(NullPointerException.class,()->listinteger.getFirst(),"The List is empty!!");

        //Adding some elements into the list.
        for(int i = 0;i < 10;i++){
            listinteger.addLast(i);
        }
        assertEquals(9,listinteger.getLast(),"The last element is wrong!!");
    }

    @org.junit.jupiter.api.Test
    void testremoveLast() {
        //The list is empty.
        assertThrows(NullPointerException.class,()->listinteger.getFirst(),"The List is empty!!");

        //Adding some elements into the list.
        for(int i = 0;i < 10;i++){
            listinteger.addLast(i);
        }

        for(int i = 9;i > -1;i--) {
            assertEquals(i, listinteger.removeLast(), "The returned element is wrong!!");
        }

        //Die Liste ist nun leer.
        assertThrows(NullPointerException.class,()->listinteger.removeLast(),"The List is empty!!");
    }

    @org.junit.jupiter.api.Test
    void contains() {
        //The list is empty.
        assertThrows(NullPointerException.class,()->listinteger.getFirst(),"The List is empty!!");

        //Adding some elements into the list.
        for(int i = 0;i < 10;i++){
            listinteger.addLast(i);
        }

        for(int i = 0;i < 10;i++){
            assertTrue(listinteger.contains(i),"The element does not exist in the list!!");
        }
        assertFalse(listinteger.contains(10),"The element 10 exist in the list!!");
        assertFalse(listinteger.contains(12),"The element 10 exist in the list!!");
        assertFalse(listinteger.contains(100),"The element 10 exist in the list!!");
    }

    @org.junit.jupiter.api.Test
    void size() {
        //The list is empty.
        assertEquals(0,listinteger.size(),"The list is not empty!!");

        //The list is not empty.
        for(int i = 0;i < 10;i++){
            listinteger.addLast(i);
        }
        assertEquals(10,listinteger.size(),"Size is not 10!!");
    }
}