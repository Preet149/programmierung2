import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class LifoTest {
     Lifo lf1,lf2;

    @BeforeEach
    void setUp() {
        lf1 = new Lifo(5);
        lf2 = new Lifo(5);
    }

    @AfterEach
    void tearDown() {
        lf1 = lf2 = null;
    }

    @org.junit.jupiter.api.Test
    void testpop() throws StackOverFlowExceptions {
        //Adding 5 elements on the stack.
        for(int i = 0;i < 5;i++){
            lf1.push(i);
        }

        //Check the sequence of the elements using the push methods.
        for(int i = 4;i > -1;i--){
            assertEquals(i,lf1.pop(),"Oops something went wrong!!");
        }
    }

    @Test
    void testexceptions() throws StackOverFlowExceptions {
        //No elements on the stack.
        assertThrows(ArrayIndexOutOfBoundsException.class,()->lf1.pop(),"Oops something is wrong!!");

        //Adding negative numbers on the stack.
        assertThrows(IllegalArgumentException.class,()->lf1.push(-3),"Oops something is wrong!!");

        //Extending the capacity of the stack.
        for(int i = 0;i < 5;i++){
            lf1.push(i);
        }
        assertThrows(StackOverFlowExceptions.class,()->lf1.push(2),"Oops something is wrong!!");
    }


}