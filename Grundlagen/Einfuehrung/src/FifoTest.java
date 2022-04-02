import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class FifoTest {
     Fifo f1,f2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        f1 = new Fifo(5);
        f2 = new Fifo(5);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        f1 = f2 = null;
    }

    @org.junit.jupiter.api.Test
    void testpop() throws StackOverFlowExceptions {
        //Adding 5 elements on the stack.
        for(int i = 0;i < f1.size();i++){
            f1.push(i);
        }

        //Check the sequence of the elements using the push methods.
        for(int i = 0;i < f1.size();i++){
            assertEquals(i,f1.pop(),"Oops something went wrong!!");
        }
    }

    @Test
    void testexceptions() throws StackOverFlowExceptions {
        //No elements on the stack.
        assertThrows(ArrayIndexOutOfBoundsException.class,()->f1.pop(),"Oops something is wrong!!");

        //Adding negative numbers on the stack.
        assertThrows(IllegalArgumentException.class,()->f1.push(-3),"Oops something is wrong!!");

        //Extending the capacity of the stack.
        for(int i = 0;i < 5;i++){
            f1.push(i);
        }
        assertThrows(StackOverFlowExceptions.class,()->f1.push(2),"Oops something is wrong!!");
    }
}