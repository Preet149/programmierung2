import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class LifoTest {
     Lifo<Integer>lfi;
     Lifo<String>lfs;
     String[]words = {"My","name","is","Preet"};
     Integer[]numbers = {13,23,45,45};

    @BeforeEach
    void setUp() {
        lfi = new Lifo<>(4);
        lfs = new Lifo<>(4);
    }

    @Test
    //Checks the sequence from the output of the pop method.
    void testCheckSeqzuenz() throws StackOverFlowExceptions {
        //Working with Integer Objects
        for(int i = 0;i < lfi.capacity();i++){
            lfi.push(numbers[i]);
        }

        for(int i = lfi.capacity()-1;i > -1;i--){
            assertEquals(numbers[i],lfi.pop(),"The sequence of the numbers are not correct!!");
        }

        //Working with String Objects
        for(int i = 0;i < lfs.capacity();i++){
            lfs.push(words[i]);
        }

        for(int i = lfs.capacity()-1;i > -1;i--){
            assertEquals(words[i],lfs.pop(),"The sequence of the words are not correct!!");
        }
    }
}