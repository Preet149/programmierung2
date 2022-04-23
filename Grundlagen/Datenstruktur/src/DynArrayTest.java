import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class DynArrayTest {
     Integer[]zahlen = {1,2,3,4,5};
     DynArray<Integer>speicher;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        speicher = new DynArray<>();
    }

    @Test
    //Testet wie viele Elemente es im Array gebe.
    void test_how_many_elements(){
        //The array is empty.
        assertEquals(0,speicher.size(),"The size of the array is not 0!");

        //Adding some elements into the array.
        for(Integer i : zahlen){
            speicher.addLast(i);
        }
        assertEquals(5,speicher.size(),"The size of the array is not 5!");
    }






}