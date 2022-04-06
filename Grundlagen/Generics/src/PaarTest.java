import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *author: Preet
 */class PaarTest {
     Paar<Integer,String> p;
     Paar<Integer,String> q;
     Paar<Integer,String> x;

    @BeforeEach
    //Creating a new Object of type Paar<Integer,String>.
    void setUp() {
        p = new Paar<>(34,"Hi");
        q = new Paar<>(34,"Hi");
        x = new Paar<>(12,"aa");
    }

    @Test
    //Testing whether the method returns the correct value.
    void TestgetErstens(){
        assertEquals(34,p.getErstens(),"The method getErstens returned the wrong value!!");
    }

    @Test
    //Testing whether the method set and returns the correct value.
    void TestsetErstens(){
        assertEquals(34,p.setErstens(44),"The method setErstens returned the wrong value!!");
    }

    @Test
    //Testing whether the method returns the correct value.
    void TestgetZweitens(){
        assertEquals("Hi",p.getZweitens(),"The method getZweitens returned the wrong value!!");
    }

    @Test
    //Testing whether the method set and returns the correct value.
    void TestsetZweitens(){
        assertEquals("Hi",p.setZweitens("Bye"),"The method setErstens returned the wrong value!!");
    }

    @Test
    //Testing whether the method sets the correct values to their corresponding components.
    void TestsetBeide(){
        p.setBeide(12,"sss");
        assertEquals(12,p.getErstens(),"The method returns the wrong value!!");
        assertEquals("sss",p.getZweitens(),"The method returns the wrong value!!");
    }

    @Test
    //Testing whether each components are same.
    void Testequalcomponents(){
        assertTrue(p.equals(q),"The corresponding components are not same!!");
        assertFalse(p.equals(x),"Each components are same!!");
    }

    @Test
    //Testing whether the method delivers the correct String.
    void TesttoString(){
        assertEquals("(34,Hi)",p.toString(),"The method returns the wrong String!!");
    }
}