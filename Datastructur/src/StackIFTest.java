import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class StackIFTest {
     Integer[]numbers = {1,2,3,4,5};
     Stack<Integer>s1;

    @org.junit.jupiter.api.BeforeEach
    @DisplayName("Making a new object of class Stack.")
    void setUp() {
        s1 = new Stack<>();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing the sequence of the pushed elements, excepted correct sequence")
    void test_sequence_of_pushed_elements() {
        for(Integer i:numbers){
            s1.push(i);
        }

        for(int i = s1.size()-1;i>-1;i--){
            assertEquals(numbers[i],s1.pop(),"The sequence are not correct!!");
        }
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing the number of elements in the stack, excepted correct size")
    void test_size_of_stack() {
        for(Integer i:numbers){
            s1.push(i);
        }
        assertEquals(5,s1.size(),"The size of the stack is not correct!!");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing the size of empty stack, expected 0")
    void test_size_of_emptystack() {
        assertEquals(0,s1.size(),"The size of the stack is not correct!!");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing wether the stack is empty, expected true(when empty) or false(when not empty)")
    void test_stack_isempyt() {
        assertTrue(s1.isEmpty(),"The stack is not empty!!");
        s1.push(2);
        assertFalse(s1.isEmpty(),"The stack is empty!!");
    }
}