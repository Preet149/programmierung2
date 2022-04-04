import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class FifoTest {
    Fifo<Integer> fi;
    Fifo<String> fs;
    String[] words = {"Hallo", "Bye", "Hi", "Wow", "Oops"};

    @org.junit.jupiter.api.BeforeEach
        //Creating 2 Objects of type String and Integer.
    void setUp() {
        fi = new Fifo<>(5);
        fs = new Fifo<>(5);
    }

    @Test
        //Prüft die Reihenfolge der Ausgabe von der pop Methode.
    void testCheckSequenz() throws StackOverFlowExceptions {
        //Working with Integer type
        for (int i = 0; i < fi.capacity(); i++) {
            fi.push(i);
        }

        for (int i = 0; i < fi.capacity(); i++) {
            assertEquals(i, fi.pop(), "The Sequenz of the numbers is not correct!!");
        }

        //Working with String type
        for (int i = 0; i < fs.capacity(); i++) {
            fs.push(words[i]);
        }

        for (int i = 0; i < fs.capacity(); i++) {
            assertEquals(words[i], fs.pop(), "The Sequenz of the words are not correct!!");
        }
    }
}